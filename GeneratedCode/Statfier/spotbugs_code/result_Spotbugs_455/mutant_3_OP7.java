class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }

    return milliseconds % 60 * 60 * 1000 == 0;
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}