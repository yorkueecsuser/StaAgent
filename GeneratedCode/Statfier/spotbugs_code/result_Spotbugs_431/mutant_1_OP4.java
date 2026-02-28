import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest5 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.MEDIUM)
  int x;

  public synchronized void add1() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x = -1;
    } else {
      x += 1;
    }
  }

  public synchronized void add2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x = -2;
    } else {
      x += 2;
    }
  }

  public synchronized void add3() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x = -3;
    } else {
      x += 3;
    }
  }

  public synchronized void add4() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x = -4;
    } else {
      x += 4;
    }
  }

  public synchronized void add5() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x = -5;
    } else {
      x += 5;
    }
  }

  public synchronized void add6() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x = -6;
    } else {
      x += 6;
    }
  }

  int add(int y) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x = -y;
    } else {
      x += y;
    }
    return x;
  }

  static class Foo {
    public int add(SynchronizationTest5 s, int y) {
      synchronized (s) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some unreachable code
          return -y;
        } else {
          return s.add(y);
        }
      }
    }
  }

  private boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}