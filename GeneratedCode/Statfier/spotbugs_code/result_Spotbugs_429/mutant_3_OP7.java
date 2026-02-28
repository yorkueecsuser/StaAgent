import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest3 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.LOW)
  int x;

  public synchronized void add1() {
    x += 1;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public synchronized void add2() {
    x += 2;
  }

  public synchronized void add3() {
    x += 3;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public synchronized void add4() {
    x += 4;
  }

  public synchronized void add5() {
    x += 5;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public synchronized void add6() {
    x += 6;
  }

  public int getX() {
    return x;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}