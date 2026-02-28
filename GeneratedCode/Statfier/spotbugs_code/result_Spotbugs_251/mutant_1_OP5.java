class UnconditionalDeref2 {

  private void f(Object x, Object y, Object z) {
    System.out.println(y.hashCode());
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  private void g(Object x, Object y, Object z) {
    System.out.println(y.hashCode());
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
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
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}