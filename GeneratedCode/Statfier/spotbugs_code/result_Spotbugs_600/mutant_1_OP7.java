class Bug1911617 implements Cloneable {
  public Object perhapsClone(Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    
    if (o == null) {
      return "Hello";
    }
    if (o instanceof Bug1911617) {
      return ((Bug1911617) o).clone();
    } else {
      return null;
    }
  }

  @Override
  public Object clone() {
    return null;
  }

  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the loop unreachable
  }
}