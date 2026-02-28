class StringCompare {
  String x, y, z;

  public static boolean compare(StringCompare a, StringCompare b) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }

    if (a == null & b == null) return false;
    if (a == null ^ b == null) return true;
    return a.x.equals(b.x) & a.y.equals(b.y) & a.z.equals(b.z);
  }

  public static boolean compare2(StringCompare a, StringCompare b) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }

    return a.x.equals(b.x) & a.y.equals(b.y);
  }

  private static boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and will never be true
    return false;
  }
}