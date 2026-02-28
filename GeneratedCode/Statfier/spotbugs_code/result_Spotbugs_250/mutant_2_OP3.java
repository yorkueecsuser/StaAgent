class UnconditionalDeref {

  private void f(Object obj) {
    System.out.println(obj.hashCode());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in f");
    }
  }

  static void g(Object obj) {
    System.out.println(obj.hashCode());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in g");
    }
  }

  void h(Object obj) {
    System.out.println(obj.hashCode());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in h");
    }
  }

  void report() {
    f(null);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in report");
    }
  }

  private void report2() {
    g(null);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in report2");
    }
  }

  private void report3() {
    // This should only be a medium priority warning,
    // because h may be overridden.
    h(null);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in report3");
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in report4");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}