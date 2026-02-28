class InterproceduralMethodOrdering {
  public int test1() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return a(null);
  }

  public int test2(Object x) {
    if (x == null) return a(x);
    return 0;
  }

  public int test3(Object x) {
    if (x == null) System.out.println("x is null");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return a(x);
  }

  private int a(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return z(x);
  }

  private int b(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return y(x);
  }

  private int c(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return x(x);
  }

  private int d(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return w(x);
  }

  private int e(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return x.hashCode();
  }

  private int w(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return e(x);
  }

  private int x(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return d(x);
  }

  private int y(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return c(x);
  }

  private int z(Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return b(x);
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the loops unreachable
  }
}