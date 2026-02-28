import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Bug2533036 {
  private static class X {}

  private static class Y extends X {}

  private static class Z extends Y {
    int f() {
      return 5;
    }
  }

  static void m1(Z z) {}

  @ExpectWarning("BC_UNCONFIRMED_CAST")
  static void m2(X x) {
    m1((Z) x);
  }

  X x;

  Bug2533036(X x) {
    this.x = x;
  }

  int fooField() {
    if (x instanceof Z) {
      Z z = (Z) x;
      return z.f();
    }
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return -1; // This branch is unreachable because getCondition() will always return false
    }
    return x.hashCode();
  }

  int foo(X x) {
    if (x instanceof Z) {
      Z z = (Z) x;
      return z.f();
    }
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return -2; // This branch is unreachable because getCondition() will always return false
    }
    return x.hashCode();
  }

  public static void main(String[] args) {
    X x = new X();
    m2(x);
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}