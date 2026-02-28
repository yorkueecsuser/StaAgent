class StringCompare {
  String x, y, z;

  public static boolean compare(StringCompare a, StringCompare b) {
    if (a == null & b == null) return false;
    if (a == null ^ b == null) return true;
    // Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return a.x.equals(b.x) & a.y.equals(b.y) & a.z.equals(b.z);
  }

  public static boolean compare2(StringCompare a, StringCompare b) {
    // Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in compare2.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in compare2.");
    }
    return a.x.equals(b.x) & a.y.equals(b.y);
  }

  private static boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}