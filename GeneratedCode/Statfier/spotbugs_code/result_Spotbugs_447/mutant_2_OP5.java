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
    return x.hashCode();
  }

  int foo(X x) {
    if (x instanceof Z) {
      Z z = (Z) x;
      return z.f();
    }
    return x.hashCode();
  }

  public static void main(String[] args) {
    X x = new X();
    m2(x);

    // Inserting unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}