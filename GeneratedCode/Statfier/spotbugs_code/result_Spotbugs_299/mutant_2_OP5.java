class Ideas_2009_03_17 {

  public static final Long SPECIAL = -1L;

  public static boolean isSpecial(Long l) {
    return l == null || l == SPECIAL;
  }

  public static boolean areEqual(Long l1, Long l2) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This is the reachable case
        break;
    }
    return l1 == l2;
  }

  private static boolean getCondition() {
    // This method returns false, making the switch statement's first case unreachable
    return false;
  }
}