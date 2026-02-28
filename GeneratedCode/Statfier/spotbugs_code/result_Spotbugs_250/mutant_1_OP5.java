class UnconditionalDeref {

  private void f(Object obj) {
    System.out.println(obj.hashCode());
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  static void g(Object obj) {
    System.out.println(obj.hashCode());
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  void h(Object obj) {
    System.out.println(obj.hashCode());
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  void report() {
    f(null);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  private void report2() {
    g(null);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  private void report3() {
    // This should only be a medium priority warning,
    // because h may be overridden.
    h(null);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("This is an unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}