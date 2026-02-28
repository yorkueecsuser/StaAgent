class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    return new SkippedClass();
  }

  // Mutant code added here
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should run if condition is true
    }
    // Unreachable if statement
    boolean unreachableCondition = falseCondition();
    if (unreachableCondition) {
      // This block is unreachable
      System.out.println("This is an unreachable statement");
    }
  }

  private boolean getCondition() {
    // This method can return true or false based on some logic
    return true;
  }

  private boolean falseCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}