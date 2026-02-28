class UnconditionalDeref2 {

  private void f(Object x, Object y, Object z) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
    System.out.println(y.hashCode());
  }

  private void g(Object x, Object y, Object z) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in g method.");
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
    return false;
  }
}