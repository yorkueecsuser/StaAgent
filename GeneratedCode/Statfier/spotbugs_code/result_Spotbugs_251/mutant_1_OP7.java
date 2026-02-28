class UnconditionalDeref2 {

  private void f(Object x, Object y, Object z) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println(y.hashCode());
  }

  private void g(Object x, Object y, Object z) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println(y.hashCode());
  }

  void report() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    f(this, null, this);
  }

  void doNotReport() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    f(null, this, this);
  }

  void doNotReport2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    f(this, this, null);
  }

  void reportStatic() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    g(this, null, this);
  }

  void doNotReportStatic() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    g(null, this, this);
  }

  void doNotReport2Static() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    g(this, this, null);
  }

  private boolean getCondition() {
    return false;
  }
}