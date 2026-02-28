class BadRemainderCheck {
  boolean isOnHourBoundary(int milliseconds) {
    // Original code
    return milliseconds % 60 * 60 * 1000 == 0;

    // Added mutant code with an unreachable if-else statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable because the if block is unreachable
      System.out.println("This is another unreachable block");
    }
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}