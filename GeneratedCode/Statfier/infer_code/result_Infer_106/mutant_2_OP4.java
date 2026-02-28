class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    return new SkippedClass();
  }

  // Introduced mutant with an unreachable if-else statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code here
    } else {
      // Unreachable code due to condition always being false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}