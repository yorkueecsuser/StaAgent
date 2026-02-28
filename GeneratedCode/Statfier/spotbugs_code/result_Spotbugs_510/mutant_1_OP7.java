class UnreadFields {
  int x = 1;

  // Added unreachable while loop based on the mutation operator description
  boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code block
      System.out.println("This loop will never execute.");
    }
  }
}