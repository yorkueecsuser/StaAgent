class Bug1911617 implements Cloneable {
  public Object perhapsClone(Object o) {
    if (o == null) {
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because conditionWhile is never set to true
      }
      return "Hello";
    }
    if (o instanceof Bug1911617) {
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because conditionWhile is never set to true
      }
      return ((Bug1911617) o).clone();
    } else {
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because conditionWhile is never set to true
      }
      return null;
    }
  }

  @Override
  public Object clone() {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }
    return null;
  }

  private boolean getCondition() {
    // This method always returns false, making the while loops unreachable
    return false;
  }
}