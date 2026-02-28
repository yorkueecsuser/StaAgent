class Ideas_2009_04_10 {

  Object g() {
    return "x";
  }

  int f(Object y) {
    Object x = g();
    if (x == null) return 0;
    return x.hashCode();
  }

  // Mutant: Renamed variable 'x' to 'a'
  int f_mutant(Object y) {
    Object a = g();
    if (a == null) return 0;
    return a.hashCode();
  }

  static class A {
    int foobar(int x) {
      return x;
    }
  }

  // Mutant: Renamed variable 'a' to 'b'
  static int huh() {
    A b =
        new A() {
          int foobar(short x) {
            return super.foobar(x) + 1;
          }
          ;
        };
    return b.foobar(5);
  }
}