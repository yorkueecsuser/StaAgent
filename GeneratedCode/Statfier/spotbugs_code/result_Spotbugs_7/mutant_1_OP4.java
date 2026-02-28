class Ideas_2009_04_10 {

  Object g() {
    return "x";
  }

  int f(Object y) {
    Object x = g();
    if (x == null) return 0;
    // Introduced an unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      return -1; // This branch is unreachable
    } else {
      return x.hashCode();
    }
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
    // Introduced an unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      return 10; // This branch is unreachable
    } else {
      return a.foobar(5);
    }
    return a.foobar(5);
  }
}