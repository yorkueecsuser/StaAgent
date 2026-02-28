class UnconditionalDeref2 {

  private void f(Object x, Object y, Object z) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    System.out.println(y.hashCode());
  }

  private void g(Object x, Object y, Object z) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is dynamically determined to be false
    }
    System.out.println(y.hashCode());
  }

  void report() {
    f(this, null, this);
  }

  void doNotReport() {
    f(null, this, this);
  }

  void doNotReport2() {
    f(this, this, null);
  }

  void reportStatic() {
    g(this, null, this);
  }

  void doNotReportStatic() {
    g(null, this, this);
  }

  void doNotReport2Static() {
    g(this, this, null);
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined but returns false
  }
}