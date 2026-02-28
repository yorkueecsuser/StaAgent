class FieldsNotSetInConstructor {

  Object a, b, c, d, e;

  FieldsNotSetInConstructor() {
    a = this;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to make the switch statement unreachable
        break;
    }
  }

  FieldsNotSetInConstructor(Object x) {
    a = x;
    b = x;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to make the switch statement unreachable
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
        // This case is intentionally left empty to make the switch statement unreachable
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}