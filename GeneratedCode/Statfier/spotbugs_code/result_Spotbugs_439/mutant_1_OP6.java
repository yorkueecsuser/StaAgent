class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
    return unsetField;
  }

  private boolean getCondition() {
    // This method returns false, making the for loop unreachable
    return false;
  }
}