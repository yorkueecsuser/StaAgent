import edu.umd.cs.findbugs.annotations.DesireWarning;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ideas_2011_10_25 {
  static int counter;

  public int getNext() {
    synchronized (getClass()) {
      boolean condition = getCondition();
      if (condition) {
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
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        counter += 10;
    }
    return counter++;
  }

  int value;

  public int nextValue() {
    synchronized (lock) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        value += 10;
      }
      return value++;
    }
  }

  public void integerLocks() {
    Integer integerUnsafe = -100;
    Integer integerSafe = new Integer(-100);
    synchronized (integerUnsafe) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        integerUnsafe += 10;
      }
    }
  }

  public void integerLocks2() {
    Integer integerUnsafe = -100;
    Integer integerSafe = new Integer(-100);
    synchronized (integerSafe) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        integerSafe += 10;
      }
    }
  }

  long last;

  void foo() {
    for (int i = 1; i < 0x00000000FFFFFFFFL; i++) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        i += 10;
      }
    }
  }

  void foo2() {
    if (++last > 0x00000000FFFFFFFFL) last = 1;
    boolean condition = getCondition();
    if (condition) {
        // Unreachable code
        last += 10;
    }
  }

  private boolean getCondition() {
    return false;
  }
}