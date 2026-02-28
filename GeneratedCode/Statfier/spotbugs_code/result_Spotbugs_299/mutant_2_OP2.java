class Ideas_2009_03_17 {

  public static final Long SPECIAL = -1L;
  public static final Long SPECIAL = -1L; // Duplicate of the assignment statement

  public static boolean isSpecial(Long l) {
    return l == null || l == SPECIAL;
  }

  public static boolean areEqual(Long l1, Long l2) {
    return l1 == l2;
    return l1 == l2; // Duplicate of the return statement, though not an assignment, included for completeness as per description
  }
}