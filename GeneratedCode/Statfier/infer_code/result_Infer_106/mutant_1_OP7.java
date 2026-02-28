class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }

    return new SkippedClass();
  }

  private static boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and will never be true
    return false;
  }
}