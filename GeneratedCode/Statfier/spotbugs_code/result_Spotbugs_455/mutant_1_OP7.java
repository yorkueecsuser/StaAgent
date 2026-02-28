class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }

    return milliseconds % 60 * 60 * 1000 == 0;
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and will never be true
    return false;
  }
}