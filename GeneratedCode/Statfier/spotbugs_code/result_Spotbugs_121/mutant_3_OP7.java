class TrackFields {
  Object x;

  TrackFields(Object x) {
    this.x = x;
  }

  int f() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    if (x == null) return x.hashCode();
    return 42;
  }

  int f2() {
    Object tmp = x;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    if (tmp == null) return x.hashCode();
    return 42;
  }

  int g() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    if (x!= null) return 42;
    return x.hashCode();
  }

  int doNotReport() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    if (x == null) x = new Object();
    return x.hashCode();
  }

  public static Object y;

  int f3() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    // Like f, but with a static field
    if (y == null) {
      return y.hashCode();
    }
    return 42;
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the loop unreachable
  }
}