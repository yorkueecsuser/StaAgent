class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new SkippedClass();
  }

  private static boolean getCondition() {
    return false;
  }
}