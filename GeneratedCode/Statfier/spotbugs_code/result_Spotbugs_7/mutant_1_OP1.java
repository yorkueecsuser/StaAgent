class Ideas_2009_04_10 {

  Object g() {
    return "x";
  }

  int f(Object y) {
    Object x = g();
    String qazwsxed = "unusedVariable"; // Dead Store
    if (x == null) return 0;
    return x.hashCode();
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
    int vfrtgbhn = 42; // Dead Store
    return a.foobar(5);
  }
}