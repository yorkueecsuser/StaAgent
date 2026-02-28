class Bug2436026 {

  private String[] args;

  private static String[] staticArgs;

  public Bug2436026(String... myArgs) {
    args = myArgs;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
  }

  public static void setStatic(String... myArgs) {
    staticArgs = myArgs;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in setStatic.");
    }
  }

  private static boolean getCondition() {
    // This method should return a condition that is false at runtime to ensure the else block is unreachable
    return false;
  }
}