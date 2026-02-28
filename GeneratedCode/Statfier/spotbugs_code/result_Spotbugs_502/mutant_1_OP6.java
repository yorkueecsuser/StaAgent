class StaticInitializer {

  // FIXME Findbugs does say it should test this...
  static StaticInitializer superStaticInitializer = new StaticInitializer();

  static final long startTime = System.currentTimeMillis();

  public StaticInitializer() {
    System.out.println(
        System.currentTimeMillis()
            - startTime
            + " milliseconds have elapsed since start of program");
    
    // Introduced an unreachable for loop according to the mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }

  public static void main(String[] args) {
    int i = 0;
    System.out.println(i);
  }
}