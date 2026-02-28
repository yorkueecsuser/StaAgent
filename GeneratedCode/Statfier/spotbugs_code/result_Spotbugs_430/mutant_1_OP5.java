import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest4 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.LOW)
  int x;

  public synchronized void add1() {
    x += 1;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        x -= 1;
        break;
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
  }

  public synchronized void add5() {
    x += 5;
  }

  public synchronized void add6() {
    x += 6;
  }

  public boolean isNonNegative() {
    return x >= 0;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch condition always 1
    return false;
  }
}