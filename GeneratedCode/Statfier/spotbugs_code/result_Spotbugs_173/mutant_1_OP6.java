class FieldsNotSetInConstructor {

  Object a, b, c, d, e;

  FieldsNotSetInConstructor() {
    a = this;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  FieldsNotSetInConstructor(Object x) {
    a = x;
    b = x;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  @Override
  public int hashCode() {
    return a.hashCode() + b.hashCode() + c.hashCode() + e.hashCode();
  }

  @Override
  public String toString() {
    if (c == null || d == null) return a.toString();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return a.toString() + b.toString() + c.toString() + d.toString();
  }

  public void setE(Object x) {
    e = x;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the loop is unreachable
  }
}