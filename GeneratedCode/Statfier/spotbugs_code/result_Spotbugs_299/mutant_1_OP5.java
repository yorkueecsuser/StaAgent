class Ideas_2009_03_17 {

  public static final Long SPECIAL = -1L;

  public static boolean isSpecial(Long l) {
    return l == null || l == SPECIAL;
  }

  public static boolean areEqual(Long l1, Long l2) {
    return l1 == l2;
  }

  // Added mutant code with an unreachable switch statement
  public static void mutantMethod() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        // This case is unreachable because getValue(condition) will never return 1
        System.out.println("This is unreachable");
        break;
      default:
        // Default case to ensure the switch statement is syntactically correct
        break;
    }
  }

  private static boolean getCondition() {
    // This method returns a constant false, ensuring the switch condition is always false
    return false;
  }

  private static int getValue(boolean condition) {
    // This method returns 0, making the switch case 1 unreachable
    return 0;
  }
}