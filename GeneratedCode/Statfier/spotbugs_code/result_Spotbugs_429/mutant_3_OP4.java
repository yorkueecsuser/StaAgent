import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest3 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.LOW)
  int x;

  public synchronized void add1() {
    x += 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      x -= 1;
    } else {
      // Alternative code that will also never run due to the nature of shouldRun
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
      // Some code that will never run
      x -= 3;
    } else {
      // Alternative code that will also never run due to the nature of shouldRun
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
      // Some code that will never run
      x -= 5;
    } else {
      // Alternative code that will also never run due to the nature of shouldRun
      x -= 6;
    }
  }

  public synchronized void add6() {
    x += 6;
  }

  public int getX() {
    return x;
  }

  private boolean getCondition() {
    // This method should always return false to ensure the if-else branches are unreachable
    return false;
  }
}