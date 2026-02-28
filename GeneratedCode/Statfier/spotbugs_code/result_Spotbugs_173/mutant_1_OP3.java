class FieldsNotSetInConstructor {

  Object a, b, c, d, e;

  FieldsNotSetInConstructor() {
    a = this;
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      a = new Object();
    }
  }

  FieldsNotSetInConstructor(Object x) {
    a = x;
    b = x;
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      b = new Object();
    }
  }

  @Override
  public int hashCode() {
    return a.hashCode() + b.hashCode() + c.hashCode() + e.hashCode();
  }

  @Override
  public String toString() {
    if (c == null || d == null) return a.toString();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      return "Unreachable";
    }
    return a.toString() + b.toString() + c.toString() + d.toString();
  }

  public void setE(Object x) {
    e = x;
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      e = new Object();
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if statements unreachable
    return false;
  }
}