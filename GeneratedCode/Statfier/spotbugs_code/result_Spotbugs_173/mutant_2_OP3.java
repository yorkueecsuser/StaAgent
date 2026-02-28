class FieldsNotSetInConstructor {

  Object a, b, c, d, e;

  FieldsNotSetInConstructor() {
    a = this;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      a = new Object();
    }
  }

  FieldsNotSetInConstructor(Object x) {
    a = x;
    b = x;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
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
      // Unreachable code
      return "Unreachable";
    }
    return a.toString() + b.toString() + c.toString() + d.toString();
  }

  public void setE(Object x) {
    e = x;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      e = new Object();
    }
  }

  private boolean getCondition() {
    // This method should return false at runtime to ensure the if branches are unreachable
    return false;
  }
}