class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    // Original code
    return milliseconds % 60 * 60 * 1000 == 0;

    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}