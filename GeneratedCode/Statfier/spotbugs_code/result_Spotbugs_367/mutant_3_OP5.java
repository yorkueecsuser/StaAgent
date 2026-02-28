class CoupledNullness {

  public static int foo(boolean b, Object y) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        return -1;
      default:
        // This default case is also unreachable because getCondition() never returns true
        return -2;
    }
    return y.hashCode();
  }

  public static int foo2(boolean b, Object y, boolean c) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    if (c) return 2;
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        return -1;
      default:
        // This default case is also unreachable because getCondition() never returns true
        return -2;
    }
    return y.hashCode();
  }

  public static boolean equals(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x == null && y!= null) return false;
    if (x!= null && y == null) return false;
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        return false;
      default:
        // This default case is also unreachable because getCondition() never returns true
        return false;
    }
    return x.equals(y) && y.equals(x);
  }

  public static boolean equals2(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x!= null && y == null) return false;
    if (x == null && y!= null) return false;
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        return false;
      default:
        // This default case is also unreachable because getCondition() never returns true
        return false;
    }
    return x.equals(y) && y.equals(x);
  }

  private static boolean getCondition() {
    // This method always returns false, ensuring the switch statement is unreachable
    return false;
  }
}