class InterproceduralMethodOrdering {
  public int test1() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test1");
    }
    return a(null);
  }

  public int test2(Object x) {
    if (x == null) return a(x);
    return 0;
  }

  public int test3(Object x) {
    if (x == null) System.out.println("x is null");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test3");
    }
    return a(x);
  }

  private int a(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in a");
    }
    return z(x);
  }

  private int b(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in b");
    }
    return y(x);
  }

  private int c(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in c");
    }
    return x(x);
  }

  private int d(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in d");
    }
    return w(x);
  }

  private int e(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in e");
    }
    return x.hashCode();
  }

  private int w(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in w");
    }
    return e(x);
  }

  private int x(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in x");
    }
    return d(x);
  }

  private int y(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in y");
    }
    return c(x);
  }

  private int z(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in z");
    }
    return b(x);
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the if statements are unreachable
  }
}