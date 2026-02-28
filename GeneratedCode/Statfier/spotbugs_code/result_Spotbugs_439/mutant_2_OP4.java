class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      unsetField = "This will never be set";
    } else {
      // Alternative code that will also never be executed
      unsetField = "This will also never be set";
    }
    return unsetField;
  }

  private boolean getCondition() {
    // This method returns false, making the if-else branches unreachable
    return false;
  }
}