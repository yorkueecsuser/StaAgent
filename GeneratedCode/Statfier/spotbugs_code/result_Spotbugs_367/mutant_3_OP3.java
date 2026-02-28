class CoupledNullness {

  public static int foo(boolean b, Object y) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    // Inserting unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      return -1; // This line is unreachable
    }
    return y.hashCode();
  }

  public static int foo2(boolean b, Object y, boolean c) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    if (c) return 2;
    // Inserting unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      return -1; // This line is unreachable
    }
    return y.hashCode();
  }

  public static boolean equals(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x == null && y!= null) return false;
    if (x!= null && y == null) return false;
    // Inserting unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      return true; // This line is unreachable
    }
    return x.equals(y) && y.equals(x);
  }

  public static boolean equals2(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x!= null && y == null) return false;
    if (x == null && y!= null) return false;
    // Inserting unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      return true; // This line is unreachable
    }
    return x.equals(y) && y.equals(x);
  }

  private static boolean getUnreachableCondition() {
    return false; // This method always returns false, ensuring the if branch is unreachable
  }
}