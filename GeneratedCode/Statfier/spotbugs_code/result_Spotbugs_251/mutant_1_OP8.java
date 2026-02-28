class UnconditionalDeref2 {

  private void f(Object x, Object y, Object z) {
    System.out.println(y.hashCode());
  }

  private void g(Object x, Object y, Object z) {
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

  // Mutated code
  private void f(Object a, Object b, Object c) {
    System.out.println(b.hashCode());
  }

  private void g(Object a, Object b, Object c) {
    System.out.println(b.hashCode());
  }

  void reportMutant() {
    f(this, null, this);
  }

  void doNotReportMutant() {
    f(null, this, this);
  }

  void doNotReport2Mutant() {
    f(this, this, null);
  }

  void reportStaticMutant() {
    g(this, null, this);
  }

  void doNotReportStaticMutant() {
    g(null, this, this);
  }

  void doNotReport2StaticMutant() {
    g(this, this, null);
  }
}