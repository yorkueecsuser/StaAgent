class GuaranteedDereferenceInteractionWithAssertionMethods {

  public Object x;

  public boolean b;

  public int falsePositive() {

    if (x == null) System.out.println("x is null");
    if (b) {
      x = bar();
      checkForError();
    }

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
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

  private boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}