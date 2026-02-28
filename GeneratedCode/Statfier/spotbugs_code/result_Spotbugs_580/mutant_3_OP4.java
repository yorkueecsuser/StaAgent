class Ideas_2009_01_15 {

  public static int foo(Object x, Object y) {
    if (y == null) y = x;
    int h = x.hashCode();

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      h += 100; // This line is unreachable if getCondition() always returns false
    } else {
      h += 200; // This line is also unreachable if getCondition() always returns false
    }

    if (y!= null) h += y.hashCode();

    h += y.hashCode();
    return h;
  }

  public static int foo(Object x) {

    if (x == null) System.out.println("null");

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      return -1; // This line is unreachable if getCondition() always returns false
    } else {
      return -2; // This line is also unreachable if getCondition() always returns false
    }

    return x.hashCode();
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically if needed
  }
}