class StringCompare {
  String x, y, z;

  public static boolean compare(StringCompare a, StringCompare b) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }

    if (a == null & b == null) return false;
    if (a == null ^ b == null) return true;
    return a.x.equals(b.x) & a.y.equals(b.y) & a.z.equals(b.z);
  }

  public static boolean compare2(StringCompare a, StringCompare b) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }

    return a.x.equals(b.x) & a.y.equals(b.y);
  }

  private static boolean getCondition() {
    // This method returns false, making the while loop condition always false
    return false;
  }
}