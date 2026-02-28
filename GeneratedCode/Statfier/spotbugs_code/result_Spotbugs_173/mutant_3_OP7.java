class FieldsNotSetInConstructor {

  Object a, b, c, d, e;

  FieldsNotSetInConstructor() {
    a = this;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  FieldsNotSetInConstructor(Object x) {
    a = x;
    b = x;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  @Override
  public int hashCode() {
    return a.hashCode() + b.hashCode() + c.hashCode() + e.hashCode();
  }

  @Override
  public String toString() {
    if (c == null || d == null) return a.toString();
    return a.toString() + b.toString() + c.toString() + d.toString();
  }

  public void setE(Object x) {
    e = x;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the loops are unreachable
  }
}