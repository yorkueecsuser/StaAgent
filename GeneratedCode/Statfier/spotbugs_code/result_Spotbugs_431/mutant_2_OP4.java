import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest5 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.MEDIUM)
  int x;

  public synchronized void add1() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x -= 1;
    } else {
      x += 1;
    }
  }

  public synchronized void add2() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x -= 2;
    } else {
      x += 2;
    }
  }

  public synchronized void add3() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x -= 3;
    } else {
      x += 3;
    }
  }

  public synchronized void add4() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x -= 4;
    } else {
      x += 4;
    }
  }

  public synchronized void add5() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x -= 5;
    } else {
      x += 5;
    }
  }

  public synchronized void add6() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x -= 6;
    } else {
      x += 6;
    }
  }

  int add(int y) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x -= y;
    } else {
      x += y;
    }
    return x;
  }

  static class Foo {
    public int add(SynchronizationTest5 s, int y) {
      synchronized (s) {
        boolean condition = s.getCondition();
        if (condition) {
          // Some unreachable code
          s.x -= y;
        } else {
          return s.add(y);
        }
      }
      return 0; // To avoid unreachable statement error
    }
  }

  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically at runtime
  }
}