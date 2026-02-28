class UnconditionalDeref {

  private void f(Object obj) {
    System.out.println(obj.hashCode());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block");
    }
  }

  static void g(Object obj) {
    System.out.println(obj.hashCode());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in g");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in g");
    }
  }

  void h(Object obj) {
    System.out.println(obj.hashCode());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in h");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in h");
    }
  }

  void report() {
    f(null);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in report");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in report");
    }
  }

  private void report2() {
    g(null);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in report2");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in report2");
    }
  }

  private void report3() {
    // This should only be a medium priority warning,
    // because h may be overridden.
    h(null);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in report3");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in report3");
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in report4");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in report4");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if-else blocks unreachable
  }
}