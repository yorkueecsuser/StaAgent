class FieldsNotSetInConstructor {

  Object a, b, c, d, e;

  FieldsNotSetInConstructor() {
    a = this;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        a = new Object();
        break;
    }
  }

  FieldsNotSetInConstructor(Object x) {
    a = x;
    b = x;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        b = new Object();
        break;
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
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        e = new Object();
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}