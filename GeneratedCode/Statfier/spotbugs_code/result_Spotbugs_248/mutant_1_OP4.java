class InterproceduralMethodOrdering {
  public int test1() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable if statement");
      } else {
        System.out.println("This is an unreachable else statement");
      }
    }
    return a(null);
  }

  public int test2(Object x) {
    if (x == null) return a(x);
    return 0;
  }

  public int test3(Object x) {
    if (x == null) System.out.println("x is null");
    return a(x);
  }

  private int a(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable if statement in a");
      } else {
        System.out.println("This is an unreachable else statement in a");
      }
    }
    return z(x);
  }

  private int b(Object x) {
    return y(x);
  }

  private int c(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable if statement in c");
      } else {
        System.out.println("This is an unreachable else statement in c");
      }
    }
    return x(x);
  }

  private int d(Object x) {
    return w(x);
  }

  private int e(Object x) {
    return x.hashCode();
  }

  private int w(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable if statement in w");
      } else {
        System.out.println("This is an unreachable else statement in w");
      }
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
    return true; // This method can be modified to return any dynamic condition
  }

  private boolean getFalseCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}