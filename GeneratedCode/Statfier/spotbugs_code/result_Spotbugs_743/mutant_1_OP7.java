class Finalize {
  @Override
  protected void finalize() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will always be false
    }
  }

  private boolean getCondition() {
    return false;
  }
}