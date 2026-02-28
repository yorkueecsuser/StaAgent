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
      return -1; // This branch is unreachable
    }
    return x.hashCode();
  }

  private boolean getUnreachableCondition() {
    return false; // This method ensures the condition is false at runtime
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
      return 10; // This branch is unreachable
    }
    return a.foobar(5);
  }

  private static boolean getUnreachableCondition() {
    return false; // This method ensures the condition is false at runtime
  }
}