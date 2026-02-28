class EncapsulationViolation {
  private byte extensionValue[] = {1, 2, 3};

  public byte[] getExtensionValue() {
    if (extensionValue == null) return null;

    byte[] dup = new byte[extensionValue.length];
    System.arraycopy(extensionValue, 0, dup, 0, dup.length);

    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      dup = new byte[0]; // Unique code to ensure mutation
    } else {
      // Alternative code that will always execute
      dup = new byte[extensionValue.length];
      System.arraycopy(extensionValue, 0, dup, 0, dup.length);
    }

    return (dup);
  }

  private boolean getCondition() {
    // This method returns a condition that is always false
    return false;
  }
}