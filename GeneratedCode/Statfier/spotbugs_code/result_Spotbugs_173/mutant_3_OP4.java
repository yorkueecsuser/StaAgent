class FieldsNotSetInConstructor {

  Object a, b, c, d, e;

  FieldsNotSetInConstructor() {
    a = this;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that won't run
      a = new Object();
    } else {
      // Another unreachable code
      b = new Object();
    }
  }

  FieldsNotSetInConstructor(Object x) {
    a = x;
    b = x;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that won't run
      c = new Object();
    } else {
      // Another unreachable code
      d = new Object();
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that won't run
      e = new Object();
    } else {
      // Another unreachable code
      e = new Object();
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}