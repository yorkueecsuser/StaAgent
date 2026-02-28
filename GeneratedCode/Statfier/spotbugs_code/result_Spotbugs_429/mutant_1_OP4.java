import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest3 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.LOW)
  int x;

  public synchronized void add1() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x -= 1;
    } else {
      x += 1;
    }
  }

  public synchronized void add2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x -= 2;
    } else {
      x += 2;
    }
  }

  public synchronized void add3() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x -= 3;
    } else {
      x += 3;
    }
  }

  public synchronized void add4() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x -= 4;
    } else {
      x += 4;
    }
  }

  public synchronized void add5() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x -= 5;
    } else {
      x += 5;
    }
  }

  public synchronized void add6() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x -= 6;
    } else {
      x += 6;
    }
  }

  public int getX() {
    return x;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}