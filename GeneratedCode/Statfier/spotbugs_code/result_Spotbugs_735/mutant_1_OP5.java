class StringCompare {
  String x, y, z;

  public static boolean compare(StringCompare a, StringCompare b) {
    if (a == null & b == null) return false;
    if (a == null ^ b == null) return true;
    
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable switch case");
        break;
    }
    
    return a.x.equals(b.x) & a.y.equals(b.y) & a.z.equals(b.z);
  }

  public static boolean compare2(StringCompare a, StringCompare b) {
    return a.x.equals(b.x) & a.y.equals(b.y);
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}