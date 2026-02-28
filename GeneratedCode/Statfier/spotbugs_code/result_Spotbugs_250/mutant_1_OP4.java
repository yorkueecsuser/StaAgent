class UnconditionalDeref {

  private void f(Object obj) {
    System.out.println(obj.hashCode());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This is a reachable block");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This is an unreachable block");
    }
  }

  static void g(Object obj) {
    System.out.println(obj.hashCode());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This is a reachable block in g");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This is an unreachable block in g");
    }
  }

  void h(Object obj) {
    System.out.println(obj.hashCode());
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This is a reachable block in h");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This is an unreachable block in h");
    }
  }

  void report() {
    f(null);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This is a reachable block in report");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This is an unreachable block in report");
    }
  }

  private void report2() {
    g(null);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This is a reachable block in report2");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This is an unreachable block in report2");
    }
  }

  private void report3() {
    // This should only be a medium priority warning,
    // because h may be overridden.
    h(null);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This is a reachable block in report3");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This is an unreachable block in report3");
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
      // This is a reachable block
      System.out.println("This is a reachable block in report4");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This is an unreachable block in report4");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the else block is unreachable
  }
}