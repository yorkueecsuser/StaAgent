class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    return unsetField;
  }

  // Mutant code added according to the Duplication mutation operator
  private String unsetFieldCopy = null; // This is a unique addition to demonstrate duplication

  public String getUnsetFieldCopy() {
    return unsetFieldCopy;
  }
}