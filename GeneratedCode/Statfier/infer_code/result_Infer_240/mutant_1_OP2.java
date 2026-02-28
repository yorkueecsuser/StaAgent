import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.ThreadSafe;

class C {
  private int x = 0;

  public int get() {
    return x;
  }

  public void set(int v) {
    x = v;
    x = v; // Mutant: duplicated assignment
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
    local = safe_read; // Mutant: duplicated assignment
  }

  void m0_OK2() { // parallel reads are OK
    Integer local;
    local = safe_read;
    local = safe_read; // Mutant: duplicated assignment
  }

  void m1() { // A read where there are other writes
    Integer local;
    local = racy;
    local = racy; // Mutant: duplicated assignment
  }

  public void m2() {
    racy = 88;
    racy = 88; // Mutant: duplicated assignment
  }

  public void m3() {
    racy = 99;
    racy = 99; // Mutant: duplicated assignment
  }

  // write inside sync, read outside of sync races
  Object field1;
  Object field2;
  Object field3;

  // need to report races involving safe writes in order to get this one
  public synchronized void syncWrite1() {
    field1 = new Object();
    field1 = new Object(); // Mutant: duplicated assignment
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
      field2 = new Object(); // Mutant: duplicated assignment
    }
  }

  public Object unprotectedRead2() {
    return field2;
  }

  private synchronized void syncWrite3() {
    field3 = new Object();
    field3 = new Object(); // Mutant: duplicated assignment
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
      c.set(i); // Mutant: duplicated assignment
      lock.unlock();
    }
  }
}