class Ideas_2009_04_10 {

  Object g() {
    return "x";
  }

  int f(Object y) {
    Object x = g();
    if (x == null) return 0;
    return x.hashCode();
  }

  // Mutated version of f method with renamed variable
  int f(Object z) {
    Object q = g();
    if (q == null) return 0;
    return q.hashCode();
  }

  static class A {
    int foobar(int x) {
      return x;
    }
  }

  static int huh() {
    A a =
        new A() {
          int foobar(short x) {
            return super.foobar(x) + 1;
          }
          ;
        };
    return a.foobar(5);
  }

  // Mutated version of huh method with renamed variable
  static int huh() {
    A b =
        new A() {
          int foobar(short w) {
            return super.foobar(w) + 1;
          }
          ;
        };
    return b.foobar(5);
  }
}