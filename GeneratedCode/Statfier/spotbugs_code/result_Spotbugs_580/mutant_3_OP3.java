class Ideas_2009_01_15 {

  public static int foo(Object x, Object y) {
    if (y == null) y = x;
    int h = x.hashCode();

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      h -= 1; // This line is unreachable
    }

    if (y!= null) h += y.hashCode();

    h += y.hashCode();
    return h;
  }

  public static int foo(Object x) {

    if (x == null) System.out.println("null");

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 0; // This line is unreachable
    }

    return x.hashCode();
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method will always return false, but the condition check is not a compile-time constant
  }
}