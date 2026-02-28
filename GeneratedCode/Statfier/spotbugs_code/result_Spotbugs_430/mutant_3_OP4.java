import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest4 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.LOW)
  int x;

  public synchronized void add1() {
    x += 1;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x -= 1;
    } else {
      // Another unreachable code
      x -= 2;
    }
  }

  public synchronized void add2() {
    x += 2;
  }

  public synchronized void add3() {
    x += 3;
  }

  public synchronized void add4() {
    x += 4;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x -= 3;
    } else {
      // Another unreachable code
      x -= 4;
    }
  }

  public synchronized void add5() {
    x += 5;
  }

  public synchronized void add6() {
    x += 6;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x -= 5;
    } else {
      // Another unreachable code
      x -= 6;
    }
  }

  public boolean isNonNegative() {
    return x >= 0;
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if-else branches unreachable
  }
}