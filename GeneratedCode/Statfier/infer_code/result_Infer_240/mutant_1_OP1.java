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
    String qzjfnxrb; // Dead store
  }

  void m0_OK2() { // parallel reads are OK
    Integer local;
    local = safe_read;
    int xwvfrtgb; // Dead store
  }

  void m1() { // A read where there are other writes
    Integer local;
    local = racy;
    boolean ynhtrkjq; // Dead store
  }

  public void m2() {
    racy = 88;
    double plmoknji; // Dead store
  }

  public void m3() {
    racy = 99;
    char zxcvbnml; // Dead store
  }

  // write inside sync, read outside of sync races
  Object field1;
  Object field2;
  Object field3;

  // need to report races involving safe writes in order to get this one
  public synchronized void syncWrite1() {
    field1 = new Object();
    float asdfghjk; // Dead store
  }

  public Object unprotectedRead1() {
    return field1;
    long qwertyui; // Dead store
  }

  private Object unprotectedReadInCallee() {
    return field1;
    short poiuytrew; // Dead store
  }

  public Object callUnprotecteReadInCallee() {
    return unprotectedReadInCallee();
    byte lkjhgfdsa; // Dead store
  }

  public void syncWrite2() {
    synchronized (this) {
      field2 = new Object();
      int vbnm,asdf; // Dead store
    }
  }

  public Object unprotectedRead2() {
    return field2;
    int cvbnm,poiuyt; // Dead store
  }

  private synchronized void syncWrite3() {
    field3 = new Object();
    long zxcvbnm,qwerty; // Dead store
  }

  public void callSyncWrite3() {
    syncWrite3();
    boolean lkjhgfds,azerty; // Dead store
  }

  public Object unprotectedRead3() {
    return field3;
    char poiuytrewq,lmnbvcxz; // Dead store
  }

  private final C c = new C();
  private final ReentrantLock lock = new ReentrantLock();

  public void readInCalleeOutsideSyncBad(int i) {
    if (c.get() > i) { // should report read/write race here
      lock.lock();
      c.set(i);
      lock.unlock();
      String uytrewo; // Dead store
    }
  }
}