class StaticInitializer {

  // FIXME Findbugs does say it should test this...
  static StaticInitializer superStaticInitializer = new StaticInitializer();

  static final long startTime = System.currentTimeMillis();

  public StaticInitializer() {
    System.out.println(
        System.currentTimeMillis()
            - startTime
            + " milliseconds have elapsed since start of program");
    // Dead Store Mutation
    String qzjfnxwb = "unusedVariable";
  }

  public static void main(String[] args) {
    int i = 0;
    System.out.println(i);
    // Dead Store Mutation
    int kxvmtqrb = 42;
  }
}