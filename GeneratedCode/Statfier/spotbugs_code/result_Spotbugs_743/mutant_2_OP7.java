class Finalize {
  @Override
  protected void finalize() {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
  }

  private boolean getCondition() {
    return false;
  }
}