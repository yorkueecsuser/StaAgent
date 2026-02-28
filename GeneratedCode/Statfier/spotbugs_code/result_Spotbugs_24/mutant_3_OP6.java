class Ideas_2009_10_06 {

  void f(Object k, Object v) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    k.hashCode();
    if (v == null) throw new NullPointerException();
  }

  void f2(Object k, Object v) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    if (v == null) throw new NullPointerException();
    k.hashCode();
  }

  void testFirstArg() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    f(null, "a");
  }

  void testSecondArg() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    f("a", null);
  }

  void testFirstArg2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    f2(null, "a");
  }

  void testSecondArg2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    f2("a", null);
  }

  private boolean getCondition() {
    return false;
  }
}