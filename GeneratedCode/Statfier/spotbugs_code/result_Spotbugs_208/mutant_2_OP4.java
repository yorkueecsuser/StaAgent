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
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition always being true
    }
    return ((int[]) o).length;
  }

  public int x() {
    int y = ((HashSet) new HashSet()).size();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to condition always being true
    }
    return ((InnerClass) this).x();
  }

  private boolean getCondition() {
    // This method should return a condition that is always true in this context
    return true;
  }
}