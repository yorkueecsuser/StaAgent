class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that might run
    } else {
      // This is an unreachable else branch
      System.out.println("This else branch is unreachable");
    }
    return new SkippedClass();
  }

  private static boolean getCondition() {
    // This method returns false, making the else branch unreachable at runtime
    return false;
  }
}