class Ideas_2009_10_06 {

  void f(Object k, Object v) {
    k.hashCode();
    if (v == null) throw new NullPointerException();
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code.");
    }
  }

  void f2(Object k, Object v) {
    if (v == null) throw new NullPointerException();
    k.hashCode();
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code.");
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

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return true; // This ensures the first branch is always taken, making the else branch unreachable
  }
}