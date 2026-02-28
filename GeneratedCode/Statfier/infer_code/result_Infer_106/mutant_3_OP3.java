class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    return new SkippedClass();
  }

  // Introduced mutant with an unreachable if statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should run if condition is true
    }
    // Unreachable if statement
    boolean unreachableCondition = isUnreachable();
    if (unreachableCondition) {
      // This block is unreachable because isUnreachable() always returns false
      System.out.println("This will never be printed");
    }
  }

  private boolean getCondition() {
    // This method can return true or false based on some logic
    return true;
  }

  private boolean isUnreachable() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}