class Ideas_2009_01_15 {

  public static int foo(Object x, Object y) {
    if (y == null) y = x;
    int h = x.hashCode();

    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }

    if (y!= null) h += y.hashCode();

    h += y.hashCode();
    return h;
  }

  public static int foo(Object x) {

    if (x == null) System.out.println("null");

    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable if statement");
    }

    return x.hashCode();
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}