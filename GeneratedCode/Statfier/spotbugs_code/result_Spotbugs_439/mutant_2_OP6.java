class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return unsetField;
  }

  private boolean getCondition() {
    return false;
  }
}