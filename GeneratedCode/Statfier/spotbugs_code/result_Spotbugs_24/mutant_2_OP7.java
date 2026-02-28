class Ideas_2009_10_06 {

  void f(Object k, Object v) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    k.hashCode();
    if (v == null) throw new NullPointerException();
  }

  void f2(Object k, Object v) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    if (v == null) throw new NullPointerException();
    k.hashCode();
  }

  void testFirstArg() {
    f(null, "a");
  }

  void testSecondArg() {
    f("a", null);
  }

  void testFirstArg2() {
    f2(null, "a");
  }

  void testSecondArg2() {
    f2("a", null);
  }

  private boolean getCondition() {
    return false;
  }
}