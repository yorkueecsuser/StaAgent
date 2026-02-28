class UnconditionalDeref {

  private void f(Object obj) {
    System.out.println(obj.hashCode());
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  static void g(Object obj) {
    System.out.println(obj.hashCode());
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  void h(Object obj) {
    System.out.println(obj.hashCode());
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  void report() {
    f(null);
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  private void report2() {
    g(null);
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  private void report3() {
    // This should only be a medium priority warning,
    // because h may be overridden.
    h(null);
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
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
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}