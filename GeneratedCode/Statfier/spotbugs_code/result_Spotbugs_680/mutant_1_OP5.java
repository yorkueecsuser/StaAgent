import edu.umd.cs.findbugs.annotations.CheckForNull;

class RedundantNullCheck {
  public void foo(String s) {
    int k = 1;
    int i = s.hashCode();
    int j = i + k;
    System.out.println(j);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is always executed
        System.out.println("Reachable case 1");
        break;
    }

    if (s!= null) { // bug, or defensive coding?
      System.out.println("Yeah");

      if (s!= null) { // not as bad - low priority warning
        System.out.println("Oh my");
      }
    }

    Object o = new Object();
    if (o!= null) { // low priority
      System.out.println(o.hashCode());
    }

    Object o2 = null;
    if (o2 == null) { // low priority
      System.out.println("This is silly");
    }
  }

  public int baz(String s) {
    if (s.hashCode() > 0) return s.hashCode();
    if (s == null) throw new NullPointerException("Foo");
    return -s.hashCode();
  }

  public int bar(String s) {
    try {
      if (s == null) return 17;
      else return 42;
    } finally {
      // Should not signal a RCN warning here
      if (s!= null) System.out.println("foo");
    }
  }

  public @CheckForNull Object f() {
    return null;
  }

  public int g() {
    Object o = f();
    if (o == null) return 0;
    return 42;
  }

  public int h() {
    Object o = f();
    return o.hashCode();
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}

// vim:ts=4