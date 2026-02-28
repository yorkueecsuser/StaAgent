import java.util.HashSet;

class InfiniteLoopFalsePositive {

  private int f() {
    if (this instanceof InnerClass) return ((InnerClass) this).f();
    return 17;
  }

  public int g() {
    if (this instanceof InnerClass) return ((InnerClass) this).g();
    return 17;
  }

  static class InnerClass extends InfiniteLoopFalsePositive {
    @Override
    public int x() {
      return 42;
    }

    public int f() {
      return 42;
    }

    @Override
    public int g() {
      return 42;
    }
  }

  int z(Object o) {
    o = o;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        return 99; // This branch is unreachable because condition is always false
      } else {
        return 100; // This branch is also unreachable
      }
    }
    return ((int[]) o).length;
  }

  public int x() {
    int y = ((HashSet) new HashSet()).size();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        return 99; // This branch is unreachable because condition is always false
      } else {
        return 100; // This branch is also unreachable
      }
    }
    return ((InnerClass) this).x();
  }

  private boolean getCondition() {
    return false; // This method returns false, making the if-else branches unreachable
  }
}