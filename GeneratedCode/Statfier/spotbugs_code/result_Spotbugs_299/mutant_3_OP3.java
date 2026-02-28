class Ideas_2009_03_17 {

  public static final Long SPECIAL = -1L;

  public static boolean isSpecial(Long l) {
    // Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
    return l == null || l == SPECIAL;
  }

  public static boolean areEqual(Long l1, Long l2) {
    // Inserting an unreachable if branch
    boolean condition = getAnotherCondition();
    if (condition) {
      // This block is unreachable because getAnotherCondition() always returns false
      System.out.println("This is another unreachable statement.");
    }
    return l1 == l2;
  }

  // Method to return false dynamically
  private static boolean getCondition() {
    return false;
  }

  // Another method to return false dynamically
  private static boolean getAnotherCondition() {
    return false;
  }
}