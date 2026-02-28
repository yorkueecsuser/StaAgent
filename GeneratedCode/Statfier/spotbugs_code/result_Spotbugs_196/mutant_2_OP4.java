import edu.umd.cs.findbugs.annotations.DesireWarning;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ideas_2011_10_25 {
  static int counter;

  public int getNext() {
    synchronized (getClass()) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
          counter += 2; // This line is unreachable
        } else {
          counter += 3; // This line is also unreachable
        }
      }
      return counter++;
    }
  }

  static class Subclass extends Ideas_2011_10_25 {}

  Lock lock = new ReentrantLock();

  @DesireWarning("")
  public synchronized int getNext2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        counter += 2; // This line is unreachable
      } else {
        counter += 3; // This line is also unreachable
      }
    }
    return counter++;
  }

  int value;

  public int nextValue() {
    synchronized (lock) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
          value += 2; // This line is unreachable
        } else {
          value += 3; // This line is also unreachable
        }
      }
      return value++;
    }
  }

  public void integerLocks() {
    Integer integerUnsafe = -100;
    Integer integerSafe = new Integer(-100);
    synchronized (integerUnsafe) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
          integerUnsafe++; // This line is unreachable
        } else {
          integerUnsafe--; // This line is also unreachable
        }
      }
    }
  }

  public void integerLocks2() {
    Integer integerUnsafe = -100;
    Integer integerSafe = new Integer(-100);
    synchronized (integerSafe) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
          integerSafe++; // This line is unreachable
        } else {
          integerSafe--; // This line is also unreachable
        }
      }
    }
  }

  long last;

  void foo() {
    for (int i = 1; i < 0x00000000FFFFFFFFL; i++) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
          i += 2; // This line is unreachable
        } else {
          i -= 2; // This line is also unreachable
        }
      }
    }
  }

  void foo2() {
    if (++last > 0x00000000FFFFFFFFL) last = 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        last += 2; // This line is unreachable
      } else {
        last -= 2; // This line is also unreachable
      }
    }
  }

  private boolean getCondition() {
    return true; // This method can be modified to return any dynamic condition
  }

  private boolean getUnreachableCondition() {
    return false; // This method ensures the condition is always false, making the branch unreachable
  }
}