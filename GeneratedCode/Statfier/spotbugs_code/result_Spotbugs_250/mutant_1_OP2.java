class UnconditionalDeref {

  private void f(Object obj) {
    System.out.println(obj.hashCode());
  }

  static void g(Object obj) {
    System.out.println(obj.hashCode());
  }

  void h(Object obj) {
    System.out.println(obj.hashCode());
  }

  void report() {
    f(null);
    f(null); // Mutation: Duplicate the call to f(null)
  }

  private void report2() {
    g(null);
    g(null); // Mutation: Duplicate the call to g(null)
  }

  private void report3() {
    // This should only be a medium priority warning,
    // because h may be overridden.
    h(null);
    h(null); // Mutation: Duplicate the call to h(null)
  }

  Object returnsNull() {
    return null;
  }

  // @Override
  @Override
  public int hashCode() {
    return 0;
  }

  // We report equals() methods which unconditionally dereference the
  // parameter
  @Override
  public boolean equals(Object o) {
    return o.hashCode() == this.hashCode() && o == this;
  }

  // We don't get this one currently
  void report4() {
    Object o = returnsNull();
    System.out.println(o.hashCode());
    System.out.println(o.hashCode()); // Mutation: Duplicate the call to System.out.println(o.hashCode())
  }
}