class EncapsulationViolation {
  private byte extensionValue[] = {1, 2, 3};

  public byte[] getExtensionValue() {
    if (extensionValue == null) return null;

    byte[] dup = new byte[extensionValue.length];
    System.arraycopy(extensionValue, 0, dup, 0, dup.length);

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      dup[0] = 0;
    }

    return (dup);
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if block is unreachable
    return false;
  }
}