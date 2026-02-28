class UnconditionalDeref {

  private void f(Object obj) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println(obj.hashCode());
  }

  static void g(Object obj) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println(obj.hashCode());
  }

  void h(Object obj) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println(obj.hashCode());
  }

  void report() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    f(null);
  }

  private void report2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    g(null);
  }

  private void report3() {
    // This should only be a medium priority warning,
    // because h may be overridden.
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    h(null);
  }

  Object returnsNull() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  // @Override
  @Override
  public int hashCode() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return 0;
  }

  // We report equals() methods which unconditionally dereference the
  // parameter
  @Override
  public boolean equals(Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return o.hashCode() == this.hashCode() && o == this;
  }

  // We don't get this one currently
  void report4() {
    Object o = returnsNull();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println(o.hashCode());
  }

  private boolean getCondition() {
    return false;
  }
}