class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    // Dead store mutation
    String abcdexyz = "unusedVariable";
    return unsetField;
  }
}