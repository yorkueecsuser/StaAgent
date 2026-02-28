class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  // Introduced an unreachable while loop according to the mutation operator
  public void someMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }
}