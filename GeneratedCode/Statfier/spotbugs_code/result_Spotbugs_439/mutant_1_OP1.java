class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    String jxqzbnvt = "unusedVariable"; // Dead store mutation
    return unsetField;
  }
}