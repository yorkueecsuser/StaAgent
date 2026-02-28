class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  // Introduced an unreachable for loop as per the mutation operator
  public void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This loop is unreachable");
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }
}