class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  // Introduced an unreachable while loop according to the mutation operator description
  public void someMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will always be false
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, making the while loop unreachable
  }
}