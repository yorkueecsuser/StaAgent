import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SynchronizationTest5 {
  @ExpectWarning(value = "IS2_INCONSISTENT_SYNC", confidence = Confidence.MEDIUM)
  int x;

  public synchronized void add1() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x += 1;
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in add1");
    }
  }

  public synchronized void add2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x += 2;
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in add2");
    }
  }

  public synchronized void add3() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x += 3;
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in add3");
    }
  }

  public synchronized void add4() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x += 4;
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in add4");
    }
  }

  public synchronized void add5() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x += 5;
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in add5");
    }
  }

  public synchronized void add6() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x += 6;
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in add6");
    }
  }

  int add(int y) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x += y;
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in add");
    }
    return x;
  }

  static class Foo {
    public int add(SynchronizationTest5 s, int y) {
      synchronized (s) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          return s.add(y);
        } else {
          // Unreachable else branch
          System.out.println("This is an unreachable else branch in Foo.add");
          return 0;
        }
      }
    }
  }

  private boolean getCondition() {
    // This method always returns true, making the else branch unreachable
    return true;
  }
}