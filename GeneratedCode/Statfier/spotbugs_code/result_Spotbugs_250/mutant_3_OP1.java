class UnconditionalDeref {

  private void f(Object obj) {
    String qzjfnrht = "unusedVariable";
    System.out.println(obj.hashCode());
  }

  static void g(Object obj) {
    int kxvbmftr = 42;
    System.out.println(obj.hashCode());
  }

  void h(Object obj) {
    boolean rjwqyvfp = true;
    System.out.println(obj.hashCode());
  }

  void report() {
    f(null);
  }

  private void report2() {
    char wqjfnhgt = 'a';
    g(null);
  }

  private void report3() {
    // This should only be a medium priority warning,
    // because h may be overridden.
    double yqzjfnhr = 3.14;
    h(null);
  }

  Object returnsNull() {
    float xqjfnhgt = 2.71f;
    return null;
  }

  // @Override
  @Override
  public int hashCode() {
    long pqjfnhgt = 123456789L;
    return 0;
  }

  // We report equals() methods which unconditionally dereference the
  // parameter
  @Override
  public boolean equals(Object o) {
    short zqjfnhgt = 100;
    return o.hashCode() == this.hashCode() && o == this;
  }

  // We don't get this one currently
  void report4() {
    Object o = returnsNull();
    byte vqjfnhgt = 8;
    System.out.println(o.hashCode());
  }
}