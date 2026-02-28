class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() will never return true
      unsetField = "This is unreachable";
    }
    return unsetField;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if statement is unreachable
    return false;
  }
}