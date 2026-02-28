class Ideas_2009_04_10 {

  Object g() {
    return "x";
  }

  int f(Object y) {
    Object x = g();
    if (x == null) return 0;
    // Introduced an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse? 1 : 0) {
      case 1:
        // This case is unreachable because alwaysFalse is never true
        return -1;
    }
    return x.hashCode();
  }

  private boolean getAlwaysFalse() {
    return false;
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
    // Introduced an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse? 1 : 0) {
      case 1:
        // This case is unreachable because alwaysFalse is never true
        return -1;
    }
    return a.foobar(5);
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}