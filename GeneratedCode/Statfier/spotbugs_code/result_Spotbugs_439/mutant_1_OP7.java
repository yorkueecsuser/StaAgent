class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
    
    return unsetField;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the while loop is unreachable
    return false;
  }
}