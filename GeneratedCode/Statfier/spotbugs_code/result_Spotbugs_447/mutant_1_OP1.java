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
    // Dead store mutation
    String abcdabcd = "unused";
  }

  X x;

  Bug2533036(X x) {
    this.x = x;
    // Dead store mutation
    int efghijkl = 42;
  }

  int fooField() {
    if (x instanceof Z) {
      Z z = (Z) x;
      return z.f();
    }
    return x.hashCode();
    // Dead store mutation
    boolean mnopqrst = true;
  }

  int foo(X x) {
    if (x instanceof Z) {
      Z z = (Z) x;
      return z.f();
    }
    return x.hashCode();
    // Dead store mutation
    double uvwxyzab = 3.14;
  }

  public static void main(String[] args) {
    X x = new X();
    m2(x);
    // Dead store mutation
    char cdefghij = 'a';
  }
}