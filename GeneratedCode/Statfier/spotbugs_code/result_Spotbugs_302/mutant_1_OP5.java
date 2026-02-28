class Ideas_2011_07_26 {

  Boolean foo(int x) {
    if (x > 0) return true;
    if (x < 0) return false;
    return null;
  }

  void f(int x) {
    if (foo(x)) System.out.println("Foo");

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("Unreachable Case 0");
        break;
      case 1:
        // This case will always be executed
        System.out.println("Reachable Case 1");
        break;
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the switch statement is mostly unreachable
    return false;
  }
}