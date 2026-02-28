import edu.umd.cs.findbugs.annotations.CheckForNull;

class RedundantNullCheck {
  public void foo(String s) {
    int k = 1;
    int i = s.hashCode();
    int j = i + k;
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

    // Dead store mutation
    int qzjxvbnr = 42; // Unique variable declaration
  }

  public int baz(String s) {
    if (s.hashCode() > 0) return s.hashCode();
    if (s == null) throw new NullPointerException("Foo");
    return -s.hashCode();

    // Dead store mutation
    String lmwptfgh = "unused"; // Unique variable declaration
  }

  public int bar(String s) {
    try {
      if (s == null) return 17;
      else return 42;
    } finally {
      // Should not signal a RCN warning here
      if (s!= null) System.out.println("foo");
    }

    // Dead store mutation
    double yrtkjhgf = 3.14; // Unique variable declaration
  }

  public @CheckForNull Object f() {
    return null;

    // Dead store mutation
    boolean cvbhnjmk = true; // Unique variable declaration
  }

  public int g() {
    Object o = f();
    if (o == null) return 0;
    return 42;

    // Dead store mutation
    char xcvbnmlo = 'a'; // Unique variable declaration
  }

  public int h() {
    Object o = f();
    return o.hashCode();

    // Dead store mutation
    float asdfghjk = 2.718f; // Unique variable declaration
  }
}

// vim:ts=4