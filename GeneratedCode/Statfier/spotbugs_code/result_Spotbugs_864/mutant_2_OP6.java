class EncapsulationViolation {
  private byte extensionValue[] = {1, 2, 3};

  public byte[] getExtensionValue() {
    if (extensionValue == null) return null;

    byte[] dup = new byte[extensionValue.length];
    System.arraycopy(extensionValue, 0, dup, 0, dup.length);

    // Introduced an unreachable for loop as per the mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
    }

    return (dup);
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}