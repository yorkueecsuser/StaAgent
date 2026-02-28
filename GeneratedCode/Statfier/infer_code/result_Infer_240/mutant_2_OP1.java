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
    String qzjfnbkd = "unused"; // Dead store
  }

  void m0_OK2() { // parallel reads are OK
    Integer local;
    local = safe_read;
    int xhtrkzqf = 42; // Dead store
  }

  void m1() { // A read where there are other writes
    Integer local;
    local = racy;
    boolean jvbnrhty = true; // Dead store
  }

  public void m2() {
    racy = 88;
    double wqejfzxc = 3.14; // Dead store
  }

  public void m3() {
    racy = 99;
    char ghtyujmn = 'a'; // Dead store
  }

  // write inside sync, read outside of sync races
  Object field1;
  Object field2;
  Object field3;

  // need to report races involving safe writes in order to get this one
  public synchronized void syncWrite1() {
    field1 = new Object();
    float tyujmnbv = 2.71f; // Dead store
  }

  public Object unprotectedRead1() {
    return field1;
    long klnmghtr = 100L; // Dead store
  }

  private Object unprotectedReadInCallee() {
    return field1;
    short yuiopasd = 10; // Dead store
  }

  public Object callUnprotecteReadInCallee() {
    return unprotectedReadInCallee();
    byte asdfghjk = 5; // Dead store
  }

  public void syncWrite2() {
    synchronized (this) {
      field2 = new Object();
      int poiuytrew = 20; // Dead store
    }
  }

  public Object unprotectedRead2() {
    return field2;
    boolean cvbnmkji = false; // Dead store
  }

  private synchronized void syncWrite3() {
    field3 = new Object();
    String zxcvbnml = "another unused"; // Dead store
  }

  public void callSyncWrite3() {
    syncWrite3();
    double asdfghjkl = 1.618; // Dead store
  }

  public Object unprotectedRead3() {
    return field3;
    char qwertyui = 'b'; // Dead store
  }

  private final C c = new C();
  private final ReentrantLock lock = new ReentrantLock();

  public void readInCalleeOutsideSyncBad(int i) {
    if (c.get() > i) { // should report read/write race here
      lock.lock();
      c.set(i);
      lock.unlock();
      int fghjklpoi = 30; // Dead store
    }
  }
}