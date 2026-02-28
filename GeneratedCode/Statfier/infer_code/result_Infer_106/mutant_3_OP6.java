class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    return new SkippedClass();

    // Introduced Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  private static boolean getCondition() {
    // This method returns false, making the loop condition always false at runtime
    return false;
  }
}