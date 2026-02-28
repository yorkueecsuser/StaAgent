class InterproceduralMethodOrdering {
  public int test1() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in test1");
    }
    return a(null);
  }

  public int test2(Object x) {
    if (x == null) return a(x);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in test2");
    }
    return 0;
  }

  public int test3(Object x) {
    if (x == null) System.out.println("x is null");
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in test3");
    }
    return a(x);
  }

  private int a(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in a");
    }
    return z(x);
  }

  private int b(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in b");
    }
    return y(x);
  }

  private int c(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in c");
    }
    return x(x);
  }

  private int d(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in d");
    }
    return w(x);
  }

  private int e(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in e");
    }
    return x.hashCode();
  }

  private int w(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in w");
    }
    return e(x);
  }

  private int x(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in x");
    }
    return d(x);
  }

  private int y(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in y");
    }
    return c(x);
  }

  private int z(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in z");
    }
    return b(x);
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if statements unreachable
  }
}