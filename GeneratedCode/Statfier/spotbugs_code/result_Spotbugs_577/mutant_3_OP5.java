class GuaranteedDereferenceInteractionWithAssertionMethods {

  public Object x;

  public boolean b;

  public int falsePositive() {

    if (x == null) System.out.println("x is null");
    if (b) {
      x = bar();
      checkForError();
    }

    // Introduced unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable");
        break;
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

    // Introduced unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable");
        break;
    }

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
    return false;
  }
}