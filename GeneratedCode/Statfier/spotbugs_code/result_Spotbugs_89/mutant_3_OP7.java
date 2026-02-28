class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
      x = 5; // Just a random operation to ensure the loop body is not empty
    }

    return x;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false at runtime
  }
}