class Bug2437445 {

  public static int foo(Object x) {
    int h = x.hashCode();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    if (x == null) return 0;
    return h;
  }

  private static boolean getCondition() {
    return false;
  }
}