class InterproceduralMethodOrdering {
  public int test1() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in test1");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in test1");
    }
    return a(null);
  }

  public int test2(Object x) {
    if (x == null) return a(x);
    return 0;
  }

  public int test3(Object x) {
    if (x == null) System.out.println("x is null");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in test3");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in test3");
    }
    return a(x);
  }

  private int a(Object x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in a");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in a");
    }
    return z(x);
  }

  private int b(Object x) {
    return y(x);
  }

  private int c(Object x) {
    return x(x);
  }

  private int d(Object x) {
    return w(x);
  }

  private int e(Object x) {
    return x.hashCode();
  }

  private int w(Object x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in w");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in w");
    }
    return e(x);
  }

  private int x(Object x) {
    return d(x);
  }

  private int y(Object x) {
    return c(x);
  }

  private int z(Object x) {
    return b(x);
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the if-else blocks are unreachable
  }
}