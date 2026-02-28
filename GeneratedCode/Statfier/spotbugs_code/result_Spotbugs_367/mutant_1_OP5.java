class CoupledNullness {

  public static int foo(boolean b, Object y) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        return -1; // Unreachable code
    }
    return y.hashCode();
  }

  public static int foo2(boolean b, Object y, boolean c) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    if (c) return 2;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        return -2; // Unreachable code
    }
    return y.hashCode();
  }

  public static boolean equals(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x == null && y!= null) return false;
    if (x!= null && y == null) return false;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        return false; // Unreachable code
    }
    return x.equals(y) && y.equals(x);
  }

  public static boolean equals2(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x!= null && y == null) return false;
    if (x == null && y!= null) return false;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        return false; // Unreachable code
    }
    return x.equals(y) && y.equals(x);
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}