class StringCompare {
  String x, y, z;

  public static boolean compare(StringCompare a, StringCompare b) {
    if (a == null & b == null) return false;
    if (a == null ^ b == null) return true;
    return a.x.equals(b.x) & a.y.equals(b.y) & a.z.equals(b.z);

    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      System.out.println("This is also an unreachable block");
    }
  }

  public static boolean compare2(StringCompare a, StringCompare b) {
    return a.x.equals(b.x) & a.y.equals(b.y);

    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block in compare2");
    } else {
      System.out.println("This is also an unreachable block in compare2");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}