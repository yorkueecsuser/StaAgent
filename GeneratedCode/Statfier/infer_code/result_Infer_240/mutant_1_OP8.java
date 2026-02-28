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
  }

  void m0_OK2() { // parallel reads are OK
    Integer local;
    local = safe_read;
  }

  void m1() { // A read where there are other writes
    Integer local;
    local = racy;
  }

  public void m2() {
    racy = 88;
  }

  public void m3() {
    racy = 99;
  }

  // write inside sync, read outside of sync races
  Object field1;
  Object field2;
  Object field3;

  // need to report races involving safe writes in order to get this one
  public synchronized void syncWrite1() {
    field1 = new Object();
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
  }

  public Object unprotectedRead2() {
    return field2;
  }

  private synchronized void syncWrite3() {
    field3 = new Object();
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
  }

  // Mutated code starts here
  void m0_ok() {
    Integer z;
    z = safe_read;
  }

  void m0_ok2() { // parallel reads are OK
    Integer y;
    y = safe_read;
  }

  void m1_mutated() { // A read where there are other writes
    Integer w;
    w = racy;
  }

  public void m2_mutated() {
    racy = 77;
  }

  public void m3_mutated() {
    racy = 66;
  }

  // write inside sync, read outside of sync races
  Object fielda;
  Object fieldb;
  Object fieldc;

  // need to report races involving safe writes in order to get this one
  public synchronized void syncwrite1() {
    fielda = new Object();
  }

  public Object unprotectedread1() {
    return fielda;
  }

  private Object unprotectedreadincallee() {
    return fielda;
  }

  public Object callunprotectedreadincallee() {
    return unprotectedreadincallee();
  }

  public void syncwrite2() {
    synchronized (this) {
      fieldb = new Object();
    }
  }

  public Object unprotectedread2_mutated() {
    return fieldb;
  }

  private synchronized void syncwrite3_mutated() {
    fieldc = new Object();
  }

  public void callsyncwrite3_mutated() {
    syncwrite3_mutated();
  }

  public Object unprotectedread3_mutated() {
    return fieldc;
  }

  private final C d = new C();
  private final ReentrantLock lock_mutated = new ReentrantLock();

  public void readincalleebad_mutated(int j) {
    if (d.get() > j) { // should report read/write race here
      lock_mutated.lock();
      d.set(j);
      lock_mutated.unlock();
    }
  }
}