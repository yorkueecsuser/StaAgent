class Ideas_2009_04_10 {

  Object g() {
    return "x";
  }

  int f(Object y) {
    Object x = g();
    if (x == null) return 0;
    // Unreachable for loop inserted here
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
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
    // Unreachable for loop inserted here
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
    return a.foobar(5);
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}