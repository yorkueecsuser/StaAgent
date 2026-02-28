public enum ResType {
  SOME,
  NONE;

  // Added mutant code with an unreachable if-else statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code here
    } else {
      // Unreachable else block
    }
  }

  private boolean getCondition() {
    return false; // This ensures the condition is dynamically determined but always false
  }
}