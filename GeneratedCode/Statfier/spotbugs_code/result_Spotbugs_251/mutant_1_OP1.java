class UnconditionalDeref2 {

  private void f(Object x, Object y, Object z) {
    System.out.println(y.hashCode());
    // Dead Store Mutation
    String qvbnrhty = "unusedVariable";
  }

  private void g(Object x, Object y, Object z) {
    System.out.println(y.hashCode());
    // Dead Store Mutation
    int wxyzabcd = 42;
  }

  void report() {
    f(this, null, this);
    // Dead Store Mutation
    double abcdwxyz = 3.14;
  }

  void doNotReport() {
    f(null, this, this);
    // Dead Store Mutation
    boolean efghijkl = true;
  }

  void doNotReport2() {
    f(this, this, null);
    // Dead Store Mutation
    char mnopqrst = 'a';
  }

  void reportStatic() {
    g(this, null, this);
    // Dead Store Mutation
    long uvwxyzzz = 100L;
  }

  void doNotReportStatic() {
    g(null, this, this);
    // Dead Store Mutation
    float tuvwxyzx = 2.718f;
  }

  void doNotReport2Static() {
    g(this, this, null);
    // Dead Store Mutation
    short qrstuvwx = 10;
  }
}