class StaticInitializer {

  // FIXME Findbugs does say it should test this...
  static StaticInitializer superStaticInitializer = new StaticInitializer();

  static final long startTime = System.currentTimeMillis();

  public StaticInitializer() {
    System.out.println(
        System.currentTimeMillis()
            - startTime
            + " milliseconds have elapsed since start of program");

    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }

  public static void main(String[] args) {
    int i = 0;
    System.out.println(i);

    // Introduced an unreachable if-else statement
    boolean shouldRunMain = getConditionMain();
    if (shouldRunMain) {
      System.out.println("This will run if shouldRunMain is true.");
    } else {
      System.out.println("This is an unreachable else block in main.");
    }
  }

  private static boolean getConditionMain() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}