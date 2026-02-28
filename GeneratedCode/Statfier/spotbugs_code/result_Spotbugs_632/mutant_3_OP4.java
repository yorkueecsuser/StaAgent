class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  public void someMethod() {
    // Introducing an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("This code might run.");
    } else {
      // This is the unreachable branch
      System.out.println("This code will never run.");
    }
  }

  private boolean getCondition() {
    // This method returns a constant false, making the else branch unreachable
    return false;
  }
}