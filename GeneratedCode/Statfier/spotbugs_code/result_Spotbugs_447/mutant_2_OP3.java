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
    // Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block in fooField");
    }
    return x.hashCode();
  }

  int foo(X x) {
    if (x instanceof Z) {
      Z z = (Z) x;
      return z.f();
    }
    // Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block in foo");
    }
    return x.hashCode();
  }

  public static void main(String[] args) {
    X x = new X();
    m2(x);
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}