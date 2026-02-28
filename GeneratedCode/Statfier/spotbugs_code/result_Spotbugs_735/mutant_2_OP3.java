class StringCompare {
  String x, y, z;

  public static boolean compare(StringCompare a, StringCompare b) {
    if (a == null & b == null) return false;
    if (a == null ^ b == null) return true;
    // Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      return false;
    }
    return a.x.equals(b.x) & a.y.equals(b.y) & a.z.equals(b.z);
  }

  public static boolean compare2(StringCompare a, StringCompare b) {
    // Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      return false;
    }
    return a.x.equals(b.x) & a.y.equals(b.y);
  }

  // Method to provide a dynamically determined condition
  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if block is unreachable
  }
}