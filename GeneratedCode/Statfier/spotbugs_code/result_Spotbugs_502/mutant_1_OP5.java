class StaticInitializer {

  // FIXME Findbugs does say it should test this...
  static StaticInitializer superStaticInitializer = new StaticInitializer();

  static final long startTime = System.currentTimeMillis();

  public StaticInitializer() {
    System.out.println(
        System.currentTimeMillis()
            - startTime
            + " milliseconds have elapsed since start of program");

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      default:
        // Default case to satisfy switch requirement
        break;
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the switch is unreachable
    return false;
  }

  public static void main(String[] args) {
    int i = 0;
    System.out.println(i);
  }
}