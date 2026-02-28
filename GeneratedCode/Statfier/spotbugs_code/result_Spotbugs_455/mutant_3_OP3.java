class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    // Original code
    return milliseconds % 60 * 60 * 1000 == 0;

    // Added mutant code with an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable because getUnreachableCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}