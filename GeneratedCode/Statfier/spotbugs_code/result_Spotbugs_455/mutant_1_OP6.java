class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    // Original code
    return milliseconds % 60 * 60 * 1000 == 0;

    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will never be true at runtime
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}