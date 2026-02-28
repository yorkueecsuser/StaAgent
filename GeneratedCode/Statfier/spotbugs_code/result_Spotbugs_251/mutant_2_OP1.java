class UnconditionalDeref2 {

  private void f(Object x, Object y, Object z) {
    String abcdabcd; // Dead store mutation
    System.out.println(y.hashCode());
  }

  private void g(Object x, Object y, Object z) {
    int efghijkl; // Dead store mutation
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
}