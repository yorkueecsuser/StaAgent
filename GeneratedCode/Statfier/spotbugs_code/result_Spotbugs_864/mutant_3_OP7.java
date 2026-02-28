class EncapsulationViolation {
  private byte extensionValue[] = {1, 2, 3};

  public byte[] getExtensionValue() {
    if (extensionValue == null) return null;

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }

    byte[] dup = new byte[extensionValue.length];
    System.arraycopy(extensionValue, 0, dup, 0, dup.length);
    return (dup);
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}