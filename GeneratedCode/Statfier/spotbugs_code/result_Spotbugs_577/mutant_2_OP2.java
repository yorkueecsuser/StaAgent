class GuaranteedDereferenceInteractionWithAssertionMethods {

  public Object x;

  public boolean b;

  public int falsePositive() {

    if (x == null) System.out.println("x is null");
    if (b) {
      x = bar();
      x = bar(); // Mutation: duplicated assignment statement
      checkForError();
    }

    return x.hashCode();
  }

  int falsePositive2(Object x) {
    if (x == null) reportError();
    x = x; // Mutation: duplicated assignment statement
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
    z = z; // Mutation: duplicated assignment statement
    return x.hashCode() + z.hashCode();
  }

  public int report2(Object x, Object y, Object z) {
    if (x == null && y == null) reportError();

    if (z == null) z = new Object();
    int result = x.hashCode() + z.hashCode();
    result = result; // Mutation: duplicated assignment statement
    checkForError();
    return result;
  }
}