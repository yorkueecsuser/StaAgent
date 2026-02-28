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

  X a;

  Bug2533036(X a) {
    this.a = a;
  }

  int fooField() {
    if (a instanceof Z) {
      Z b = (Z) a;
      return b.f();
    }
    return a.hashCode();
  }

  int foo(X c) {
    if (c instanceof Z) {
      Z d = (Z) c;
      return d.f();
    }
    return c.hashCode();
  }

  public static void main(String[] args) {
    X e = new X();
    m2(e);
  }
}