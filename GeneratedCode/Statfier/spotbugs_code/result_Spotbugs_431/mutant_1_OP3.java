import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest5 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.MEDIUM)
  int x;

  public synchronized void add1() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x -= 1;
    }
    x += 1;
  }

  public synchronized void add2() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x -= 2;
    }
    x += 2;
  }

  public synchronized void add3() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x -= 3;
    }
    x += 3;
  }

  public synchronized void add4() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x -= 4;
    }
    x += 4;
  }

  public synchronized void add5() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x -= 5;
    }
    x += 5;
  }

  public synchronized void add6() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x -= 6;
    }
    x += 6;
  }

  int add(int y) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x -= y;
    }
    x += y;
    return x;
  }

  static class Foo {
    public int add(SynchronizationTest5 s, int y) {
      synchronized (s) {
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          s.x -= y;
        }
        return s.add(y);
      }
    }
  }

  private boolean getCondition() {
    return false; // This method can be used to dynamically determine the condition at runtime
  }
}