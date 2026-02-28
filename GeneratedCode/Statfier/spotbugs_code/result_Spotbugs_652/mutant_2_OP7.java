class FalseException {
  // This class is not an exception

  // Introduced an unreachable while loop according to the mutation operator
  public void someMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the while loop is unreachable
    return false;
  }
}