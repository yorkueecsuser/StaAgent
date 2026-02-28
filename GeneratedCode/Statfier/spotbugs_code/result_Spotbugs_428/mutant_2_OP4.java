import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest2 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.MEDIUM)
  int x;

  public synchronized void add1() {
    x += 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x -= 1;
    } else {
      // Alternative unreachable code
      x -= 2;
    }
  }

  public synchronized void add2() {
    x += 2;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x -= 2;
    } else {
      // Alternative unreachable code
      x -= 3;
    }
  }

  public synchronized void add3() {
    x += 3;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x -= 3;
    } else {
      // Alternative unreachable code
      x -= 4;
    }
  }

  public synchronized void add4() {
    x += 4;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x -= 4;
    } else {
      // Alternative unreachable code
      x -= 5;
    }
  }

  public synchronized void add5() {
    x += 5;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x -= 5;
    } else {
      // Alternative unreachable code
      x -= 6;
    }
  }

  public synchronized void add6() {
    x += 6;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x -= 6;
    } else {
      // Alternative unreachable code
      x -= 7;
    }
  }

  public int get2X() {
    return x + x;
  }

  private boolean getCondition() {
    // This method returns a condition that is always false at runtime
    return false;
  }
}