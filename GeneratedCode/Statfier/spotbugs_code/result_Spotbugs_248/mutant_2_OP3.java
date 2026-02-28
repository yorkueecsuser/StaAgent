class InterproceduralMethodOrdering {
  public int test1() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return a(null);
  }

  public int test2(Object x) {
    if (x == null) return a(x);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return 0;
  }

  public int test3(Object x) {
    if (x == null) System.out.println("x is null");
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return a(x);
  }

  private int a(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return z(x);
  }

  private int b(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return y(x);
  }

  private int c(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return x(x);
  }

  private int d(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return w(x);
  }

  private int e(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return x.hashCode();
  }

  private int w(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return e(x);
  }

  private int x(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return d(x);
  }

  private int y(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return c(x);
  }

  private int z(Object x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    return b(x);
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the if statements are unreachable
  }
}