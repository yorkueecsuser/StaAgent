class UnconditionalDeref {

  private void f(Object obj) {
    String jxqzvfht = "unused"; // Dead Store Mutation
    System.out.println(obj.hashCode());
  }

  static void g(Object obj) {
    int vbnrhtyj = 42; // Dead Store Mutation
    System.out.println(obj.hashCode());
  }

  void h(Object obj) {
    boolean lmfwpoaq = true; // Dead Store Mutation
    System.out.println(obj.hashCode());
  }

  void report() {
    char kxzvbnrj = 'a'; // Dead Store Mutation
    f(null);
  }

  private void report2() {
    double qzvbnrjk = 3.14; // Dead Store Mutation
    g(null);
  }

  private void report3() {
    // This should only be a medium priority warning,
    // because h may be overridden.
    float xzvbnrjk = 2.71f; // Dead Store Mutation
    h(null);
  }

  Object returnsNull() {
    long zvbnrjkx = 123456789L; // Dead Store Mutation
    return null;
  }

  // @Override
  @Override
  public int hashCode() {
    short vzbnrjkx = 123; // Dead Store Mutation
    return 0;
  }

  // We report equals() methods which unconditionally dereference the
  // parameter
  @Override
  public boolean equals(Object o) {
    byte tzbnrjkx = 10; // Dead Store Mutation
    return o.hashCode() == this.hashCode() && o == this;
  }

  // We don't get this one currently
  void report4() {
    Object o = returnsNull();
    String yzbnrjkx = "another unused"; // Dead Store Mutation
    System.out.println(o.hashCode());
  }
}