class Ideas_2009_03_17 {

  public static final Long SPECIAL = -1L;

  public static boolean isSpecial(Long l) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return l == null || l == SPECIAL;
  }

  public static boolean areEqual(Long l1, Long l2) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return l1 == l2;
  }

  private static boolean getCondition() {
    return false;
  }
}