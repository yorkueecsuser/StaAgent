class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  // Added mutant code with an unreachable if statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will run if condition is true
      System.out.println("This is reachable code.");
    }
    // Unreachable if statement
    if (!condition && getUnreachableCondition()) {
      // This code is unreachable because getUnreachableCondition() will always return false
      System.out.println("This is unreachable code.");
    }
  }

  private boolean getCondition() {
    // This method can return true or false dynamically
    return true;
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if statement unreachable
    return false;
  }
}