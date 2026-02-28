class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    // Introducing an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    
    return unsetField;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the while loop is unreachable
    return false;
  }
}