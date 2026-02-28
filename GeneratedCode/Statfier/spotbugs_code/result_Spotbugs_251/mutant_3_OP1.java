class UnconditionalDeref2 {

  private void f(Object x, Object y, Object z) {
    System.out.println(y.hashCode());
    String abcd1234 = "unused"; // Dead store mutation
  }

  private void g(Object x, Object y, Object z) {
    System.out.println(y.hashCode());
    int efgh5678 = 0; // Dead store mutation
  }

  void report() {
    f(this, null, this);
    boolean ijkl9012 = true; // Dead store mutation
  }

  void doNotReport() {
    f(null, this, this);
    char mnop3456 = 'a'; // Dead store mutation
  }

  void doNotReport2() {
    f(this, this, null);
    double qrst7890 = 3.14; // Dead store mutation
  }

  void reportStatic() {
    g(this, null, this);
    float uvwx1234 = 2.71f; // Dead store mutation
  }

  void doNotReportStatic() {
    g(null, this, this);
    long yzab5678 = 100L; // Dead store mutation
  }

  void doNotReport2Static() {
    g(this, this, null);
    short cdEF9012 = 10; // Dead store mutation
  }
}