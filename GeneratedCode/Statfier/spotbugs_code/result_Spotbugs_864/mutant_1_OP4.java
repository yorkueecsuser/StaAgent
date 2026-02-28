class EncapsulationViolation {
  private byte extensionValue[] = {1, 2, 3};

  public byte[] getExtensionValue() {
    if (extensionValue == null) return null;

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      extensionValue[0] = 0;
    } else {
      // Alternative block that will also be unreachable due to the nature of the condition
      extensionValue[0] = 1;
    }

    byte[] dup = new byte[extensionValue.length];
    System.arraycopy(extensionValue, 0, dup, 0, dup.length);
    return (dup);
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}