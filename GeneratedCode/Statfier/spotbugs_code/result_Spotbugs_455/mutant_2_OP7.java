class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    // Original code
    return milliseconds % 60 * 60 * 1000 == 0;

    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will never be true at runtime
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}