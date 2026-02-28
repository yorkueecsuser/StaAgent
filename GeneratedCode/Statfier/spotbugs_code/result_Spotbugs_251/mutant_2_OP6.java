class UnconditionalDeref2 {

  private void f(Object x, Object y, Object z) {
    System.out.println(y.hashCode());
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  private void g(Object x, Object y, Object z) {
    System.out.println(y.hashCode());
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  void report() {
    f(this, null, this);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  void doNotReport() {
    f(null, this, this);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  void doNotReport2() {
    f(this, this, null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  void reportStatic() {
    g(this, null, this);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  void doNotReportStatic() {
    g(null, this, this);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  void doNotReport2Static() {
    g(this, this, null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  private boolean getCondition() {
    return false;
  }
}