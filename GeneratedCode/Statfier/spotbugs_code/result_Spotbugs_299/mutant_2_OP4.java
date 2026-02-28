class Ideas_2009_03_17 {

  public static final Long SPECIAL = -1L;

  public static boolean isSpecial(Long l) {
    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition will always be false
      return false;
    } else {
      // This block is also unreachable because condition will always be false
      return true;
    }
    return l == null || l == SPECIAL;
  }

  public static boolean areEqual(Long l1, Long l2) {
    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition will always be false
      return true;
    } else {
      // This block is also unreachable because condition will always be false
      return false;
    }
    return l1 == l2;
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}