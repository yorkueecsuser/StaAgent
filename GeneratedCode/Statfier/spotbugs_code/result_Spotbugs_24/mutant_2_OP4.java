class Ideas_2009_10_06 {

  void f(Object k, Object v) {
    k.hashCode();
    if (v == null) throw new NullPointerException();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block.");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block.");
    }
  }

  void f2(Object k, Object v) {
    if (v == null) throw new NullPointerException();
    k.hashCode();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in f2.");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in f2.");
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

  private boolean getCondition() {
    return false; // This method will always return false, making the branches unreachable
  }
}