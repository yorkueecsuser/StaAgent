class Issue1368 {
  private String unsetField = null;
  private String x = null; // Mutant variable

  public String getUnsetField() {
    return unsetField;
  }

  public String getX() { // Mutant method
    return x;
  }
}