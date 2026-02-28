import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.ThreadSafe;

class C {
  private int x = 0;

  public int get() {
    return x;
  }

  public void set(int v) {
    x = v;
  }
}

@ThreadSafe
class ReadWriteRaces {

  // read and write outside of sync races
  Integer safe_read;
  Integer racy;

  void m0_OK() {
    Integer local;
    local = safe_read;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      local = local + 1;
    } else {
      // Some alternative code that should also never run
      local = local - 1;
    }
  }

  void m0_OK2() { // parallel reads are OK
    Integer local;
    local = safe_read;
  }

  void m1() { // A read where there are other writes
    Integer local;
    local = racy;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      local = local + 1;
    } else {
      // Some alternative code that should also never run
      local = local - 1;
    }
  }

  public void m2() {
    racy = 88;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      racy = racy + 1;
    } else {
      // Some alternative code that should also never run
      racy = racy - 1;
    }
  }

  public void m3() {
    racy = 99;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      racy = racy + 1;
    } else {
      // Some alternative code that should also never run
      racy = racy - 1;
    }
  }

  // write inside sync, read outside of sync races
  Object field1;
  Object field2;
  Object field3;

  // need to report races involving safe writes in order to get this one
  public synchronized void syncWrite1() {
    field1 = new Object();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      field1 = new Object();
    } else {
      // Some alternative code that should also never run
      field1 = null;
    }
  }

  public Object unprotectedRead1() {
    return field1;
  }

  private Object unprotectedReadInCallee() {
    return field1;
  }

  public Object callUnprotecteReadInCallee() {
    return unprotectedReadInCallee();
  }

  public void syncWrite2() {
    synchronized (this) {
      field2 = new Object();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        field2 = new Object();
      } else {
        // Some alternative code that should also never run
        field2 = null;
      }
    }
  }

  public Object unprotectedRead2() {
    return field2;
  }

  private synchronized void syncWrite3() {
    field3 = new Object();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      field3 = new Object();
    } else {
      // Some alternative code that should also never run
      field3 = null;
    }
  }

  public void callSyncWrite3() {
    syncWrite3();
  }

  public Object unprotectedRead3() {
    return field3;
  }

  private final C c = new C();
  private final ReentrantLock lock = new ReentrantLock();

  public void readInCalleeOutsideSyncBad(int i) {
    if (c.get() > i) { // should report read/write race here
      lock.lock();
      c.set(i);
      lock.unlock();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        c.set(c.get() + 1);
      } else {
        // Some alternative code that should also never run
        c.set(c.get() - 1);
      }
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, but it's not a compile-time constant
  }
}