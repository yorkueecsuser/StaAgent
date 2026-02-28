class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      unsetField = "This is unreachable";
    }
    return unsetField;
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}