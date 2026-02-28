class UnreadFields {
  int x = 1;

  // Mutant code added to introduce an unreachable while loop
  public void someMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getCondition() {
    // This method returns false, making the while loop condition always false
    return false;
  }
}