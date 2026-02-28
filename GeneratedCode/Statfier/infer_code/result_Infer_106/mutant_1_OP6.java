// _SHOULD_BE_SKIPPED_

class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    return new SkippedClass();
    
    // Introduced Unreachable for loop as per mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  private static boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }
}