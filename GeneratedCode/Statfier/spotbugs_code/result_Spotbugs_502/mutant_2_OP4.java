class StaticInitializer {

  // FIXME Findbugs does say it should test this...
  static StaticInitializer superStaticInitializer = new StaticInitializer();

  static final long startTime = System.currentTimeMillis();

  public StaticInitializer() {
    System.out.println(
        System.currentTimeMillis()
            - startTime
            + " milliseconds have elapsed since start of program");
    
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run.");
    } else {
      System.out.println("This will also never run.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }

  public static void main(String[] args) {
    int i = 0;
    System.out.println(i);
  }
}