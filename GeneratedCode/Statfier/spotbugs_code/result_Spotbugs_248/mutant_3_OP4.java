class InterproceduralMethodOrdering {
  public int test1() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("Unreachable if block");
      } else {
        System.out.println("Unreachable else block");
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("Unreachable if block");
      } else {
        System.out.println("Unreachable else block");
      }
    }
    return a(x);
  }

  private int a(Object x) {
    return z(x);
  }

  private int b(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("Unreachable if block");
      } else {
        System.out.println("Unreachable else block");
      }
    }
    return y(x);
  }

  private int c(Object x) {
    return x(x);
  }

  private int d(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("Unreachable if block");
      } else {
        System.out.println("Unreachable else block");
      }
    }
    return w(x);
  }

  private int e(Object x) {
    return x.hashCode();
  }

  private int w(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("Unreachable if block");
      } else {
        System.out.println("Unreachable else block");
      }
    }
    return e(x);
  }

  private int x(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("Unreachable if block");
      } else {
        System.out.println("Unreachable else block");
      }
    }
    return d(x);
  }

  private int y(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("Unreachable if block");
      } else {
        System.out.println("Unreachable else block");
      }
    }
    return c(x);
  }

  private int z(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("Unreachable if block");
      } else {
        System.out.println("Unreachable else block");
      }
    }
    return b(x);
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}