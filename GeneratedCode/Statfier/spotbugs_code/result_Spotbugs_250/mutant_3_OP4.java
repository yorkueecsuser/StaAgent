class UnconditionalDeref {

  private void f(Object obj) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    System.out.println(obj.hashCode());
  }

  static void g(Object obj) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    System.out.println(obj.hashCode());
  }

  void h(Object obj) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    System.out.println(obj.hashCode());
  }

  void report() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    f(null);
  }

  private void report2() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    g(null);
  }

  private void report3() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    // This should only be a medium priority warning,
    // because h may be overridden.
    h(null);
  }

  Object returnsNull() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    return null;
  }

  // @Override
  @Override
  public int hashCode() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    return 0;
  }

  // We report equals() methods which unconditionally dereference the
  // parameter
  @Override
  public boolean equals(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    return o.hashCode() == this.hashCode() && o == this;
  }

  // We don't get this one currently
  void report4() {
    Object o = returnsNull();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    System.out.println(o.hashCode());
  }

  private boolean getCondition() {
    return false;
  }
}