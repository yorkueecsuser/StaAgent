class CoupledNullness {

  public static int foo(boolean b, Object y) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      return -1; // This branch is unreachable because condition is never set to true
    }
    return y.hashCode();
  }

  public static int foo2(boolean b, Object y, boolean c) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    if (c) return 2;
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      return -2; // This branch is unreachable because condition is never set to true
    }
    return y.hashCode();
  }

  public static boolean equals(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x == null && y!= null) return false;
    if (x!= null && y == null) return false;
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      return false; // This branch is unreachable because condition is never set to true
    }
    return x.equals(y) && y.equals(x);
  }

  public static boolean equals2(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x!= null && y == null) return false;
    if (x == null && y!= null) return false;
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      return true; // This branch is unreachable because condition is never set to true
    }
    return x.equals(y) && y.equals(x);
  }

  // Method to provide a dynamic condition for unreachable if statements
  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}