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
    Integer a; // Mutant: Renamed 'local' to 'a'
    a = safe_read;
  }

  void m0_OK2() { // parallel reads are OK
    Integer local;
    local = safe_read;
    Integer b; // Mutant: Renamed 'local' to 'b'
    b = safe_read;
  }

  void m1() { // A read where there are other writes
    Integer local;
    local = racy;
    Integer c; // Mutant: Renamed 'local' to 'c'
    c = racy;
  }

  public void m2() {
    racy = 88;
    Integer d = 88; // Mutant: Added new variable 'd'
  }

  public void m3() {
    racy = 99;
    Integer e = 99; // Mutant: Added new variable 'e'
  }

  // write inside sync, read outside of sync races
  Object field1;
  Object field2;
  Object field3;

  // need to report races involving safe writes in order to get this one
  public synchronized void syncWrite1() {
    field1 = new Object();
    Object f = new Object(); // Mutant: Added new variable 'f'
  }

  public Object unprotectedRead1() {
    return field1;
    Object g = new Object(); // Mutant: Added new variable 'g'
  }

  private Object unprotectedReadInCallee() {
    return field1;
    Object h = new Object(); // Mutant: Added new variable 'h'
  }

  public Object callUnprotecteReadInCallee() {
    return unprotectedReadInCallee();
    Object i = new Object(); // Mutant: Added new variable 'i'
  }

  public void syncWrite2() {
    synchronized (this) {
      field2 = new Object();
      Object j = new Object(); // Mutant: Added new variable 'j'
    }
  }

  public Object unprotectedRead2() {
    return field2;
    Object k = new Object(); // Mutant: Added new variable 'k'
  }

  private synchronized void syncWrite3() {
    field3 = new Object();
    Object l = new Object(); // Mutant: Added new variable 'l'
  }

  public void callSyncWrite3() {
    syncWrite3();
    Object m = new Object(); // Mutant: Added new variable'm'
  }

  public Object unprotectedRead3() {
    return field3;
    Object n = new Object(); // Mutant: Added new variable 'n'
  }

  private final C c = new C();
  private final ReentrantLock lock = new ReentrantLock();

  public void readInCalleeOutsideSyncBad(int i) {
    if (c.get() > i) { // should report read/write race here
      lock.lock();
      c.set(i);
      lock.unlock();
    }
    Integer o = i; // Mutant: Added new variable 'o'
  }
}