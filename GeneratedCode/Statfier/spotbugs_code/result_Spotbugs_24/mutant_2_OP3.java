class Ideas_2009_10_06 {

  void f(Object k, Object v) {
    k.hashCode();
    if (v == null) throw new NullPointerException();
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable statement in f method.");
    }
  }

  void f2(Object k, Object v) {
    if (v == null) throw new NullPointerException();
    k.hashCode();
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable statement in f2 method.");
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

  // Method to provide a dynamic condition that will never be true
  private boolean getCondition() {
    return false;
  }
}