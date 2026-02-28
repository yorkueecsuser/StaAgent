import edu.umd.cs.findbugs.annotations.DesireWarning;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ideas_2011_10_25 {
  static int counter;

  public int getNext() {
    synchronized (getClass()) {
      boolean unreachableCondition = false;
      if (unreachableCondition) {
        // Unreachable code
        counter += 10;
      }
      return counter++;
    }
  }

  static class Subclass extends Ideas_2011_10_25 {}

  Lock lock = new ReentrantLock();

  @DesireWarning("")
  public synchronized int getNext2() {
    boolean unreachableCondition = false;
    if (unreachableCondition) {
        // Unreachable code
        counter += 5;
    }
    return counter++;
  }

  int value;

  public int nextValue() {
    synchronized (lock) {
      boolean unreachableCondition = false;
      if (unreachableCondition) {
        // Unreachable code
        value += 100;
      }
      return value++;
    }
  }

  public void integerLocks() {
    Integer integerUnsafe = -100;
    Integer integerSafe = new Integer(-100);
    synchronized (integerUnsafe) {
      boolean unreachableCondition = false;
      if (unreachableCondition) {
        // Unreachable code
        integerUnsafe++;
      }
    }
  }

  public void integerLocks2() {
    Integer integerUnsafe = -100;
    Integer integerSafe = new Integer(-100);
    synchronized (integerSafe) {
      boolean unreachableCondition = false;
      if (unreachableCondition) {
        // Unreachable code
        integerSafe++;
      }
    }
  }

  long last;

  void foo() {
    for (int i = 1; i < 0x00000000FFFFFFFFL; i++) {
      boolean unreachableCondition = false;
      if (unreachableCondition) {
        // Unreachable code
        i += 1000;
      }
    }
  }

  void foo2() {
    if (++last > 0x00000000FFFFFFFFL) last = 1;
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      last = 0;
    }
  }
}