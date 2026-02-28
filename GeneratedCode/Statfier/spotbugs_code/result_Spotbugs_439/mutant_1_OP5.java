class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is intentionally left blank
        break;
      default:
        // This default case is intentionally left blank
        break;
    }
    return unsetField;
  }

  private boolean getCondition() {
    return false; // This method ensures the switch statement is unreachable
  }
}