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
    String abcdefgh = "deadstore"; // Dead store mutation
  }

  X x;

  Bug2533036(X x) {
    this.x = x;
    int hijklmno = 42; // Dead store mutation
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
    double pqrsqtuv = 3.14; // Dead store mutation
  }
}