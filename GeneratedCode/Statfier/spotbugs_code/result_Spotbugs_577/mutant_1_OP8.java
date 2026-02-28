class GuaranteedDereferenceInteractionWithAssertionMethods {

  public Object x;

  public boolean b;

  public int falsePositive() {

    if (x == null) System.out.println("x is null");
    if (b) {
      x = bar();
      checkForError();
    }

    return x.hashCode();
  }

  int falsePositive2(Object x) {
    if (x == null) reportError();
    return x.hashCode();
  }

  // Mutant: Renamed 'b' to 'c'
  public int falsePositive3() {

    if (x == null) System.out.println("x is null");
    if (c) {
      x = bar();
      checkForError();
    }

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

  // Mutant: Renamed 'x' to 'a'
  public int report2(Object a, Object y, Object z) {
    if (a == null && y == null) reportError();

    if (z == null) z = new Object();
    int result = a.hashCode() + z.hashCode();
    checkForError();
    return result;
  }

  // Mutant: Renamed 'y' to 'q'
  public int report3(Object x, Object q, Object z) {
    if (x == null && q == null) reportError();

    if (z == null) z = new Object();
    return x.hashCode() + z.hashCode();
  }
}