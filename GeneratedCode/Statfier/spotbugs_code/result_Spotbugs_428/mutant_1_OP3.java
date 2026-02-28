import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest2 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.MEDIUM)
  int x;

  public synchronized void add1() {
    x += 1;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x -= 1;
    }
  }

  public synchronized void add2() {
    x += 2;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x -= 2;
    }
  }

  public synchronized void add3() {
    x += 3;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x -= 3;
    }
  }

  public synchronized void add4() {
    x += 4;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x -= 4;
    }
  }

  public synchronized void add5() {
    x += 5;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x -= 5;
    }
  }

  public synchronized void add6() {
    x += 6;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x -= 6;
    }
  }

  public int get2X() {
    return x + x;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}