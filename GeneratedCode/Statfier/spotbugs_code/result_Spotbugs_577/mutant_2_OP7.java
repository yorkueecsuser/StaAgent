class GuaranteedDereferenceInteractionWithAssertionMethods {

  public Object x;

  public boolean b;

  public int falsePositive() {

    if (x == null) System.out.println("x is null");
    if (b) {
      x = bar();
      checkForError();
    }

    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }

    return x.hashCode();
  }

  int falsePositive2(Object x) {
    if (x == null) reportError();
    return x.hashCode();
  }

  public void checkForError() {}

  public void reportError() {}

  public Object bar() {
    return new Object();
  }

  public int report(Object x, Object y, Object z) {
    if (x == null && y == null) reportError();

    if (z == null) z = new Object();
    return x.hashCode() + z.hashCode();
  }

  public int report2(Object x, Object y, Object z) {
    if (x == null && y == null) reportError();

    if (z == null) z = new Object();
    int result = x.hashCode() + z.hashCode();
    checkForError();
    return result;
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}