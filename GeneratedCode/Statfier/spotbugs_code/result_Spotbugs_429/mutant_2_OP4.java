import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest3 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.LOW)
  int x;

  public synchronized void add1() {
    x += 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      x += 10;
    } else {
      // This block is unreachable if shouldRun is false
      x -= 10;
    }
  }

  public synchronized void add2() {
    x += 2;
  }

  public synchronized void add3() {
    x += 3;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      x += 20;
    } else {
      // This block is unreachable if shouldRun is false
      x -= 20;
    }
  }

  public synchronized void add4() {
    x += 4;
  }

  public synchronized void add5() {
    x += 5;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      x += 30;
    } else {
      // This block is unreachable if shouldRun is false
      x -= 30;
    }
  }

  public synchronized void add6() {
    x += 6;
  }

  public int getX() {
    return x;
  }

  private boolean getCondition() {
    return false; // This ensures the else block is unreachable
  }
}