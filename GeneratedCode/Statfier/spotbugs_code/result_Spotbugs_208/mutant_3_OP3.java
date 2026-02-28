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
    if (condition) { // Unreachable if statement
      return -1; // This line is unreachable due to the condition always being false
    }
    return ((int[]) o).length;
  }

  public int x() {
    int y = ((HashSet) new HashSet()).size();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return -2; // This line is unreachable due to the condition always being false
    }
    return ((InnerClass) this).x();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}