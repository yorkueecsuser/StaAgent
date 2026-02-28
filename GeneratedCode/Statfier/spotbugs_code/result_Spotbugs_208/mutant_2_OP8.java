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
    return ((int[]) o).length;
  }

  public int x() {
    int y = ((HashSet) new HashSet()).size();
    return ((InnerClass) this).x();
  }

  // Mutated code
  int a(Object b) {
    b = b;
    return ((int[]) b).length;
  }

  public int c() {
    int d = ((HashSet) new HashSet()).size();
    return ((InnerClass) this).x();
  }
}