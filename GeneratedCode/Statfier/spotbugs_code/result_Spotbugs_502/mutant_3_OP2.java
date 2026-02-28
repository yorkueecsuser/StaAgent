class StaticInitializer {

  // FIXME Findbugs does say it should test this...
  static StaticInitializer superStaticInitializer = new StaticInitializer();
  static StaticInitializer superStaticInitializerCopy = new StaticInitializer(); // DUPLICATION

  static final long startTime = System.currentTimeMillis();
  static final long startTimeCopy = System.currentTimeMillis(); // DUPLICATION

  public StaticInitializer() {
    System.out.println(
        System.currentTimeMillis()
            - startTime
            + " milliseconds have elapsed since start of program");
  }

  public static void main(String[] args) {
    int i = 0;
    int iCopy = 0; // DUPLICATION
    System.out.println(i);
  }
}