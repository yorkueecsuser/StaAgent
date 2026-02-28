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

  // Mutated code starts here

  public int falsePositive3() {

    if (x == null) System.out.println("x is null");
    if (b) {
      x = bar();
      checkForError();
    }

    return x.hashCode();
  }

  int falsePositive4(Object a) {
    if (a == null) reportError();
    return a.hashCode();
  }

  public void checkForError2() {}

  public void reportError2() {}

  public Object bar2() {
    return new Object();
  }

  public int report3(Object a, Object b, Object c) {
    if (a == null && b == null) reportError();

    if (c == null) c = new Object();
    return a.hashCode() + c.hashCode();
  }

  public int report4(Object a, Object b, Object c) {
    if (a == null && b == null) reportError();

    if (c == null) c = new Object();
    int d = a.hashCode() + c.hashCode();
    checkForError();
    return d;
  }
}