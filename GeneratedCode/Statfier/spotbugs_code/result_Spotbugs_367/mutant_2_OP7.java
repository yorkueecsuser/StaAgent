class CoupledNullness {

  public static int foo(boolean b, Object y) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }

    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    return y.hashCode();
  }

  public static int foo2(boolean b, Object y, boolean c) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }

    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    if (c) return 2;
    return y.hashCode();
  }

  public static boolean equals(Object x, Object y) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }

    if (x == null && y == null) return true;
    if (x == null && y!= null) return false;
    if (x!= null && y == null) return false;
    return x.equals(y) && y.equals(x);
  }

  public static boolean equals2(Object x, Object y) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }

    if (x == null && y == null) return true;
    if (x!= null && y == null) return false;
    if (x == null && y!= null) return false;
    return x.equals(y) && y.equals(x);
  }

  private static boolean getCondition() {
    // This method returns a condition that is always false
    return false;
  }
}