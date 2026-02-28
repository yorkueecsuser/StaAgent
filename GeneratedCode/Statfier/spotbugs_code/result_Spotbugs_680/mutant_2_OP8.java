import edu.umd.cs.findbugs.annotations.CheckForNull;

class RedundantNullCheck {
  public void foo(String s) {
    int k = 1;
    int x = s.hashCode(); // Mutated variable name from 'i' to 'x'
    int j = x + k; // Updated to use the mutated variable name
    System.out.println(j);

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
    Object z = f(); // Mutated variable name from 'o' to 'z'
    return z.hashCode(); // Updated to use the mutated variable name
  }
}

// vim:ts=4