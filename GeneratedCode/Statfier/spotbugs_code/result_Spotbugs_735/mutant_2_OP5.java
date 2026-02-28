class StringCompare {
  String x, y, z;

  public static boolean compare(StringCompare a, StringCompare b) {
    if (a == null & b == null) return false;
    if (a == null ^ b == null) return true;
    return a.x.equals(b.x) & a.y.equals(b.y) & a.z.equals(b.z);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  public static boolean compare2(StringCompare a, StringCompare b) {
    return a.x.equals(b.x) & a.y.equals(b.y);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is not set to true
        System.out.println("This is another unreachable switch case.");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}