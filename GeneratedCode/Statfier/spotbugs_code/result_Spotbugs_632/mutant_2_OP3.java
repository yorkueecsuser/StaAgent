class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  // Introduced mutant: Unreachable if statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will execute if condition is true
      System.out.println("This is reachable code.");
    }
    // Unreachable if statement
    if (!condition && getUnreachableCondition()) {
      // This block is unreachable because getUnreachableCondition() will never be true if condition is false
      System.out.println("This is unreachable code.");
    }
  }

  private boolean getCondition() {
    // This method can return true or false based on some logic
    return false;
  }

  private boolean getUnreachableCondition() {
    // This method is designed to always return false, making the if block unreachable
    return false;
  }
}