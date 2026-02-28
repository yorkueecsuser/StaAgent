class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code here
    }
    // Inserting unreachable if statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable because getUnreachableCondition() always returns false
      neverUseStaticNonFinalFieldsEverNeverNeverEver = 42;
    }
  }

  private boolean getCondition() {
    return true; // This can be any dynamic condition
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}