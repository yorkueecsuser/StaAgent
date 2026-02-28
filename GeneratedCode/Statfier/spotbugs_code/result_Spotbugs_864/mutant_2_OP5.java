class EncapsulationViolation {
  private byte extensionValue[] = {1, 2, 3};

  public byte[] getExtensionValue() {
    if (extensionValue == null) return null;

    byte[] dup = new byte[extensionValue.length];
    System.arraycopy(extensionValue, 0, dup, 0, dup.length);

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case will never be executed
        dup[0] = 0;
        break;
      case false:
        // This case will also never be executed
        dup[1] = 0;
        break;
    }

    return (dup);
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}