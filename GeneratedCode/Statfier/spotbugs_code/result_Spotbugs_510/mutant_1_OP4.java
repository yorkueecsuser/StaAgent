class UnreadFields {
  int x = 1;

  // Added mutant code with an unreachable if-else statement
  public void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    return false; // This ensures the else block is unreachable at runtime
  }
}