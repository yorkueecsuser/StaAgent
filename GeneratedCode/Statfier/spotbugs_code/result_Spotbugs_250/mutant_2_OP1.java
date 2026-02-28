class UnconditionalDeref {

  private void f(Object obj) {
    String ykfqjvpm; // Dead store
    System.out.println(obj.hashCode());
  }

  static void g(Object obj) {
    int abcdwxyz; // Dead store
    System.out.println(obj.hashCode());
  }

  void h(Object obj) {
    boolean rstuvwxy; // Dead store
    System.out.println(obj.hashCode());
  }

  void report() {
    double efghijkl; // Dead store
    f(null);
  }

  private void report2() {
    char mnopqrst; // Dead store
    g(null);
  }

  private void report3() {
    float tuvwxyza; // Dead store
    // This should only be a medium priority warning,
    // because h may be overridden.
    h(null);
  }

  Object returnsNull() {
    long bcdefghi; // Dead store
    return null;
  }

  // @Override
  @Override
  public int hashCode() {
    short jklmnopq; // Dead store
    return 0;
  }

  // We report equals() methods which unconditionally dereference the
  // parameter
  @Override
  public boolean equals(Object o) {
    byte stuvwxyz; // Dead store
    return o.hashCode() == this.hashCode() && o == this;
  }

  // We don't get this one currently
  void report4() {
    Object o = returnsNull();
    int lmnopqrs; // Dead store
    System.out.println(o.hashCode());
  }
}