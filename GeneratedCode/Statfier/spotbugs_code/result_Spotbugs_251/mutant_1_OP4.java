class UnconditionalDeref2 {

  private void f(Object x, Object y, Object z) {
    System.out.println(y.hashCode());
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never run
      System.out.println("This is an unreachable if block");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block");
    }
  }

  private void g(Object x, Object y, Object z) {
    System.out.println(y.hashCode());
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never run
      System.out.println("This is an unreachable if block in g");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block in g");
    }
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
    return false; // This method ensures the condition is dynamically determined but always false
  }
}