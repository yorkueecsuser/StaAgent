class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    return new SkippedClass();
  }

  // Mutant code starts here
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    }
    // Unreachable if statement
    boolean unreachableCondition = isUnreachable();
    if (unreachableCondition) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed");
    }
  }

  private boolean getCondition() {
    return true; // This is just a placeholder to ensure the condition is dynamically determined
  }

  private boolean isUnreachable() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}