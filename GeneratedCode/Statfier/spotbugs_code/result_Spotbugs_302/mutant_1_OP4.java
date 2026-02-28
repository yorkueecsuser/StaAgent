class Ideas_2011_07_26 {

  Boolean foo(int x) {
    if (x > 0) return true;
    if (x < 0) return false;
    return null;
  }

  void f(int x) {
    if (foo(x)) System.out.println("Foo");

    // Mutant code: Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to the condition always being false.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}