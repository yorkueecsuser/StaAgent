class Ideas_2009_03_16 {

  public static final Long LONG_NULL = null;

  static boolean foo(Long x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return x == LONG_NULL;
  }

  static boolean foo(long x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return x == LONG_NULL;
  }

  static boolean foo2(Long x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return x == null;
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the loop is unreachable
  }
}