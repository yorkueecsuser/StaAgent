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
    f(null); // Mutant: Duplicate assignment statement
  }

  private void report2() {
    g(null);
    g(null); // Mutant: Duplicate assignment statement
  }

  private void report3() {
    // This should only be a medium priority warning,
    // because h may be overridden.
    h(null);
    h(null); // Mutant: Duplicate assignment statement
  }

  Object returnsNull() {
    return null;
    return null; // Mutant: Duplicate assignment statement
  }

  // @Override
  @Override
  public int hashCode() {
    return 0;
    return 0; // Mutant: Duplicate assignment statement
  }

  // We report equals() methods which unconditionally dereference the
  // parameter
  @Override
  public boolean equals(Object o) {
    return o.hashCode() == this.hashCode() && o == this;
    // No applicable assignment statement without method invocation
  }

  // We don't get this one currently
  void report4() {
    Object o = returnsNull();
    System.out.println(o.hashCode());
    Object o2 = returnsNull(); // Mutant: Duplicate assignment statement
    System.out.println(o2.hashCode());
  }
}