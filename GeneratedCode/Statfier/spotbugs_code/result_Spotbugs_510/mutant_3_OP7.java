class UnreadFields {
  int x = 1;

  // Added mutant code with an unreachable while loop
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