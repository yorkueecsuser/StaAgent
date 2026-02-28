import edu.umd.cs.findbugs.annotations.DesireWarning;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ideas_2011_10_25 {
  static int counter;

  public int getNext() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable while loop */ }
    synchronized (getClass()) {
      return counter++;
    }
  }

  static class Subclass extends Ideas_2011_10_25 {}

  Lock lock = new ReentrantLock();

  @DesireWarning("")
  public synchronized int getNext2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable while loop */ }
    return counter++;
  }

  int value;

  public int nextValue() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable while loop */ }
    synchronized (lock) {
      return value++;
    }
  }

  public void integerLocks() {
    Integer integerUnsafe = -100;
    Integer integerSafe = new Integer(-100);
    synchronized (integerUnsafe) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable while loop */ }
    }
  }

  public void integerLocks2() {
    Integer integerUnsafe = -100;
    Integer integerSafe = new Integer(-100);
    synchronized (integerSafe) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) { /* unreachable while loop */ }
    }
  }

  long last;

  void foo() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable while loop */ }
    for (int i = 1; i < 0x00000000FFFFFFFFL; i++) {}
  }

  void foo2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable while loop */ }
    if (++last > 0x00000000FFFFFFFFL) last = 1;
  }

  private boolean getCondition() {
    return false;
  }
}