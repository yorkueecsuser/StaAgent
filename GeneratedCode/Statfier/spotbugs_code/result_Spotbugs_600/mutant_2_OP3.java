class Bug1911617 implements Cloneable {
  public Object perhapsClone(Object o) {
    if (o == null) {
      return "Hello";
    }
    if (o instanceof Bug1911617) {
      return ((Bug1911617) o).clone();
    } else {
      return null;
    }
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return "Unreachable";
    }
  }

  @Override
  public Object clone() {
    return null;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}