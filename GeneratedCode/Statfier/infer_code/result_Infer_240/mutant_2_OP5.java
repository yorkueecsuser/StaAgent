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
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        local = 100;
        break;
    }
  }

  void m0_OK2() { // parallel reads are OK
    Integer local;
    local = safe_read;
  }

  void m1() { // A read where there are other writes
    Integer local;
    local = racy;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        local = 200;
        break;
    }
  }

  public void m2() {
    racy = 88;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        racy = 300;
        break;
    }
  }

  public void m3() {
    racy = 99;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        racy = 400;
        break;
    }
  }

  // write inside sync, read outside of sync races
  Object field1;
  Object field2;
  Object field3;

  // need to report races involving safe writes in order to get this one
  public synchronized void syncWrite1() {
    field1 = new Object();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        field1 = new Object();
        break;
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
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        field2 = new Object();
        break;
    }
  }

  public Object unprotectedRead2() {
    return field2;
  }

  private synchronized void syncWrite3() {
    field3 = new Object();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        field3 = new Object();
        break;
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
    }
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        c.set(500);
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}