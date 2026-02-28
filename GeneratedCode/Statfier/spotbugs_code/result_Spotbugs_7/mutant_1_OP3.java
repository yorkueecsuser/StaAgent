class Ideas_2009_04_10 {

  Object g() {
    return "x";
  }

  int f(Object y) {
    Object x = g();
    if (x == null) return 0;
    // Inserting unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      return -1; // Unreachable code
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
    // Inserting unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      return 999; // Unreachable code
    }
    return a.foobar(5);
  }

  // Method to provide a dynamic condition that is always false
  private boolean getUnreachableCondition() {
    return false; // This method is used to avoid compile-time unreachable statement error
  }
}