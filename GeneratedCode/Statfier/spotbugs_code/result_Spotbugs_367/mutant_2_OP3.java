class CoupledNullness {

  public static int foo(boolean b, Object y) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return -1; // This line will never be executed
    }
    return y.hashCode();
  }

  public static int foo2(boolean b, Object y, boolean c) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    if (c) return 2;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return -2; // This line will never be executed
    }
    return y.hashCode();
  }

  public static boolean equals(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x == null && y!= null) return false;
    if (x!= null && y == null) return false;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return false; // This line will never be executed
    }
    return x.equals(y) && y.equals(x);
  }

  public static boolean equals2(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x!= null && y == null) return false;
    if (x == null && y!= null) return false;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return false; // This line will never be executed
    }
    return x.equals(y) && y.equals(x);
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}