class EncapsulationViolation {
  private byte extensionValue[] = {1, 2, 3};

  public byte[] getExtensionValue() {
    if (extensionValue == null) return null;

    byte[] dup = new byte[extensionValue.length];
    System.arraycopy(extensionValue, 0, dup, 0, dup.length);

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is always false
        dup[0] = 0;
        break;
      case false:
        // This case is also unreachable because alwaysFalse is always false
        dup[0] = 1;
        break;
    }

    return (dup);
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}