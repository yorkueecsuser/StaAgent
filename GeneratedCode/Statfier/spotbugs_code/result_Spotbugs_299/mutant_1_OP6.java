class Ideas_2009_03_17 {

  public static final Long SPECIAL = -1L;

  public static boolean isSpecial(Long l) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
    return l == null || l == SPECIAL;
  }

  public static boolean areEqual(Long l1, Long l2) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
    return l1 == l2;
  }

  private static boolean getCondition() {
    // This method always returns false, ensuring the loop remains unreachable
    return false;
  }
}