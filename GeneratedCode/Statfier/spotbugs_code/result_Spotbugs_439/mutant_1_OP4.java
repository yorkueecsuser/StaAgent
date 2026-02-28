class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    // Introducing an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      unsetField = "This is a mutant";
    } else {
      // This block will always execute
      unsetField = "Original value";
    }
    return unsetField;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}