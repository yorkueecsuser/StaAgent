import edu.umd.cs.findbugs.annotations.DesireWarning;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ideas_2011_10_25 {
  static int counter;

  public int getNext() {
    synchronized (getClass()) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {} // Unreachable for loop
      return counter++;
    }
  }

  static class Subclass extends Ideas_2011_10_25 {}

  Lock lock = new ReentrantLock();

  @DesireWarning("")
  public synchronized int getNext2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
    return counter++;
  }

  int value;

  public int nextValue() {
    synchronized (lock) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {} // Unreachable for loop
      return value++;
    }
  }

  public void integerLocks() {
    Integer integerUnsafe = -100;
    Integer integerSafe = new Integer(-100);
    synchronized (integerUnsafe) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {} // Unreachable for loop
    }
  }

  public void integerLocks2() {
    Integer integerUnsafe = -100;
    Integer integerSafe = new Integer(-100);
    synchronized (integerSafe) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {} // Unreachable for loop
    }
  }

  long last;

  void foo() {
    for (int i = 1; i < 0x00000000FFFFFFFFL; i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void foo2() {
    if (++last > 0x00000000FFFFFFFFL) last = 1;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  private boolean getCondition() {
    return false;
  }
}