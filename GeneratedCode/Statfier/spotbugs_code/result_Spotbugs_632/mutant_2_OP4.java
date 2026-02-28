class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  // Mutant code starts here
  public void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that might run
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block due to the condition being always false.");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}