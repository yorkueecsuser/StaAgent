class Ideas_2009_03_17 {

  public static final Long SPECIAL = -1L;

  public static boolean isSpecial(Long l) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }
    return l == null || l == SPECIAL;
  }

  public static boolean areEqual(Long l1, Long l2) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }
    return l1 == l2;
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}