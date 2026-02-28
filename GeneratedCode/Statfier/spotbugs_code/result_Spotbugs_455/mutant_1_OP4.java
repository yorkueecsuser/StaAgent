class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    return milliseconds % 60 * 60 * 1000 == 0;

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This block is reachable");
    } else {
      // This block is unreachable because shouldRun will always be false
      System.out.println("This block is unreachable");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the else block unreachable
    return false;
  }
}