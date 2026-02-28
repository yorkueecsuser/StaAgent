class StringCompare {
  String x, y, z;

  public static boolean compare(StringCompare a, StringCompare b) {
    if (a == null & b == null) return false;
    if (a == null ^ b == null) return true;
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable block in compare method.");
    } else {
      // Alternative block that also should never execute
      System.out.println("This is another unreachable block in compare method.");
    }
    return a.x.equals(b.x) & a.y.equals(b.y) & a.z.equals(b.z);
  }

  public static boolean compare2(StringCompare a, StringCompare b) {
    // Unreachable if-else statement
    boolean shouldRun2 = getCondition();
    if (shouldRun2) {
      // This block should never execute
      System.out.println("This is an unreachable block in compare2 method.");
    } else {
      // Alternative block that also should never execute
      System.out.println("This is another unreachable block in compare2 method.");
    }
    return a.x.equals(b.x) & a.y.equals(b.y);
  }

  private static boolean getCondition() {
    // This method returns a condition that is always false
    return false;
  }
}