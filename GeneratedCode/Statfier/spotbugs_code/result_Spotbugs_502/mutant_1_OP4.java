class StaticInitializer {

  // FIXME Findbugs does say it should test this...
  static StaticInitializer superStaticInitializer = new StaticInitializer();

  static final long startTime = System.currentTimeMillis();

  public StaticInitializer() {
    System.out.println(
        System.currentTimeMillis()
            - startTime
            + " milliseconds have elapsed since start of program");

    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never be printed because shouldRun is always false.");
    } else {
      System.out.println("This will also never be printed because shouldRun is always false.");
    }
  }

  private boolean getCondition() {
    return false;
  }

  public static void main(String[] args) {
    int i = 0;
    System.out.println(i);

    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRunMain = getConditionMain();
    if (shouldRunMain) {
      System.out.println("This will never be printed because shouldRunMain is always false.");
    } else {
      System.out.println("This will also never be printed because shouldRunMain is always false.");
    }
  }

  private static boolean getConditionMain() {
    return false;
  }
}