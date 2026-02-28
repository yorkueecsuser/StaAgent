class StringCompare {
  String x, y, z;

  public static boolean compare(StringCompare a, StringCompare b) {
    if (a == null & b == null) return false;
    if (a == null ^ b == null) return true;
    
    // Inserting an unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable statement.");
    }
    
    return a.x.equals(b.x) & a.y.equals(b.y) & a.z.equals(b.z);
  }

  public static boolean compare2(StringCompare a, StringCompare b) {
    return a.x.equals(b.x) & a.y.equals(b.y);
  }

  // Method to provide a dynamically determined condition that is always false
  private static boolean getUnreachableCondition() {
    return false;
  }
}