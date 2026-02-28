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
  }

  private void report2() {
    g(null);
  }

  private void report3() {
    // This should only be a medium priority warning,
    // because h may be overridden.
    h(null);
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
  }

  // Mutated code
  private void f(Object x) {
    System.out.println(x.hashCode());
  }

  static void g(Object y) {
    System.out.println(y.hashCode());
  }

  void h(Object z) {
    System.out.println(z.hashCode());
  }

  void report() {
    f(a);
  }

  private void report2() {
    g(b);
  }

  private void report3() {
    // This should only be a medium priority warning,
    // because h may be overridden.
    h(c);
  }

  Object returnsNull() {
    return d;
  }

  // @Override
  @Override
  public int hashCode() {
    return e;
  }

  // We report equals() methods which unconditionally dereference the
  // parameter
  @Override
  public boolean equals(Object f) {
    return f.hashCode() == this.hashCode() && f == this;
  }

  // We don't get this one currently
  void report4() {
    Object g = returnsNull();
    System.out.println(g.hashCode());
  }

  private Object a = null;
  private Object b = null;
  private Object c = null;
  private Object d = null;
  private int e = 0;
}