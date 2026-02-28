import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest2 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.MEDIUM)
  int x;

  public synchronized void add1() {
    x += 1;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
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

  public int get2X() {
    return x + x;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}