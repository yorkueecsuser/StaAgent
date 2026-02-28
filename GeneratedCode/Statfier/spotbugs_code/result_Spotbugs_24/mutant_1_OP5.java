class Ideas_2009_10_06 {

  void f(Object k, Object v) {
    k.hashCode();
    if (v == null) throw new NullPointerException();

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case in f method");
        break;
    }
  }

  void f2(Object k, Object v) {
    if (v == null) throw new NullPointerException();
    k.hashCode();

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case in f2 method");
        break;
    }
  }

  void testFirstArg() {
    f(null, "a");
  }

  void testSecondArg() {
    f("a", null);
  }

  void testFirstArg2() {
    f2(null, "a");
  }

  void testSecondArg2() {
    f2("a", null);
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}