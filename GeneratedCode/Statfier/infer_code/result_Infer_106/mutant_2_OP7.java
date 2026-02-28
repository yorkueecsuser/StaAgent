class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }

    return new SkippedClass();
  }

  private static boolean getCondition() {
    // This method returns false, making the while loop unreachable
    return false;
  }
}