class EncapsulationViolation {
  private byte extensionValue[] = {1, 2, 3};

  public byte[] getExtensionValue() {
    if (extensionValue == null) return null;

    byte[] dup = new byte[extensionValue.length];
    System.arraycopy(extensionValue, 0, dup, 0, dup.length);
    return (dup);
  }

  // Mutated code with renaming operator
  public byte[] getExtensionValueMutant() {
    if (extensionValue == null) return null;

    byte[] a = new byte[extensionValue.length];
    System.arraycopy(extensionValue, 0, a, 0, a.length);
    return (a);
  }
}