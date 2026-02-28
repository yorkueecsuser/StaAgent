import edu.umd.cs.findbugs.annotations.DesireWarning;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ideas_2011_10_25 {
  static int counter;

  public int getNext() {
    synchronized (getClass()) {
      return counter++;
    }
  }

  static class Subclass extends Ideas_2011_10_25 {}

  Lock lock = new ReentrantLock();

  @DesireWarning("")
  public synchronized int getNext2() {
    int qzjfnxht; // Dead store
    return counter++;
  }

  int value;

  public int nextValue() {
    synchronized (lock) {
      String wvbnrhty; // Dead store
      return value++;
    }
  }

  public void integerLocks() {
    Integer integerUnsafe = -100;
    Integer integerSafe = new Integer(-100);
    synchronized (integerUnsafe) {
      double mnbvcvbn; // Dead store
    }
  }

  public void integerLocks2() {
    Integer integerUnsafe = -100;
    Integer integerSafe = new Integer(-100);
    synchronized (integerSafe) {
      boolean lkjhgfds; // Dead store
    }
  }

  long last;

  void foo() {
    for (int i = 1; i < 0x00000000FFFFFFFFL; i++) {
      char asdfghjk; // Dead store
    }
  }

  void foo2() {
    if (++last > 0x00000000FFFFFFFFL) last = 1;
    float poiuytrew; // Dead store
  }
}