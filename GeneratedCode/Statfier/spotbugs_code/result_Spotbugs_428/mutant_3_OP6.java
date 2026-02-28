import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest2 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.MEDIUM)
  int x;

  public synchronized void add1() {
    x += 1;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  public synchronized void add2() {
    x += 2;
  }

  public synchronized void add3() {
    x += 3;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  public synchronized void add4() {
    x += 4;
  }

  public synchronized void add5() {
    x += 5;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  public synchronized void add6() {
    x += 6;
  }

  public int get2X() {
    return x + x;
  }

  private boolean getCondition() {
    return false; // This ensures the loop is unreachable but not a compile-time constant
  }
}