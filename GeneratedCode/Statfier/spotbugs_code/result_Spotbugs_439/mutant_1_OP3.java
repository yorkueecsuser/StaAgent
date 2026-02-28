class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      unsetField = "This will never be set";
    }
    return unsetField;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}