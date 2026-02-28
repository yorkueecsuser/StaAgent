import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest2 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.MEDIUM)
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      x -= 3;
    } else {
      // Alternative code that should also never run
      x -= 4;
    }
  }

  public synchronized void add4() {
    x += 4;
  }

  public synchronized void add5() {
    x += 5;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      x -= 5;
    } else {
      // Alternative code that should also never run
      x -= 6;
    }
  }

  public synchronized void add6() {
    x += 6;
  }

  public int get2X() {
    return x + x;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}