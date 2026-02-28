import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest4 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.LOW)
  int x;

  public synchronized void add1() {
    x += 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      x -= 1;
    } else {
      // Alternative code that should also never run
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      x -= 3;
    } else {
      // Alternative code that should also never run
      x -= 4;
    }
  }

  public synchronized void add5() {
    x += 5;
  }

  public synchronized void add6() {
    x += 6;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      x -= 5;
    } else {
      // Alternative code that should also never run
      x -= 6;
    }
  }

  public boolean isNonNegative() {
    return x >= 0;
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else branches unreachable
    return false;
  }
}