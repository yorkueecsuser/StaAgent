class UnconditionalDeref2 {

  private void f(Object x, Object y, Object z) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable code");
        break;
    }
    System.out.println(y.hashCode());
  }

  private void g(Object x, Object y, Object z) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable code");
        break;
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
    return false; // This method always returns false, ensuring the switch case is unreachable
  }
}