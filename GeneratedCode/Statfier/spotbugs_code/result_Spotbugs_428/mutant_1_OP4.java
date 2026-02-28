import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest2 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.MEDIUM)
  int x;

  public synchronized void add1() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
    } else {
      // Unreachable else block
      x -= 1;
    }
    x += 1;
  }

  public synchronized void add2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
    } else {
      // Unreachable else block
      x -= 2;
    }
    x += 2;
  }

  public synchronized void add3() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
    } else {
      // Unreachable else block
      x -= 3;
    }
    x += 3;
  }

  public synchronized void add4() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
    } else {
      // Unreachable else block
      x -= 4;
    }
    x += 4;
  }

  public synchronized void add5() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
    } else {
      // Unreachable else block
      x -= 5;
    }
    x += 5;
  }

  public synchronized void add6() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
    } else {
      // Unreachable else block
      x -= 6;
    }
    x += 6;
  }

  public int get2X() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
    } else {
      // Unreachable else block
      x = 0;
    }
    return x + x;
  }

  private boolean getCondition() {
    // This method should return false to make the else blocks unreachable
    return false;
  }
}