class UnconditionalDeref2 {

  private void f(Object x, Object y, Object z) {
    System.out.println(y.hashCode());
    // Benign duplication of a non-existent assignment for mutation purposes
    int temp = 0;
    int tempDuplicate = 0;
  }

  private void g(Object x, Object y, Object z) {
    System.out.println(y.hashCode());
    // Benign duplication of a non-existent assignment for mutation purposes
    int temp = 1;
    int tempDuplicate = 1;
  }

  void report() {
    f(this, null, this);
    // Benign duplication of a non-existent assignment for mutation purposes
    boolean flag = true;
    boolean flagDuplicate = true;
  }

  void doNotReport() {
    f(null, this, this);
    // Benign duplication of a non-existent assignment for mutation purposes
    char ch = 'a';
    char chDuplicate = 'a';
  }

  void doNotReport2() {
    f(this, this, null);
    // Benign duplication of a non-existent assignment for mutation purposes
    double d = 3.14;
    double dDuplicate = 3.14;
  }

  void reportStatic() {
    g(this, null, this);
    // Benign duplication of a non-existent assignment for mutation purposes
    long l = 123456789L;
    long lDuplicate = 123456789L;
  }

  void doNotReportStatic() {
    g(null, this, this);
    // Benign duplication of a non-existent assignment for mutation purposes
    float f = 2.718f;
    float fDuplicate = 2.718f;
  }

  void doNotReport2Static() {
    g(this, this, null);
    // Benign duplication of a non-existent assignment for mutation purposes
    short s = 100;
    short sDuplicate = 100;
  }
}