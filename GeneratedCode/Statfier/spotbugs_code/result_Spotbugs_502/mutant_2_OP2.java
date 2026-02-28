class StaticInitializer {

  // FIXME Findbugs does say it should test this...
  static StaticInitializer superStaticInitializer = new StaticInitializer();
  static StaticInitializer superStaticInitializerCopy = new StaticInitializer(); // Mutant: Duplicate of the static initializer assignment

  static final long startTime = System.currentTimeMillis();
  static final long startTimeCopy = System.currentTimeMillis(); // Mutant: Duplicate of the startTime assignment

  public StaticInitializer() {
    System.out.println(
        System.currentTimeMillis()
            - startTime
            + " milliseconds have elapsed since start of program");
  }

  public static void main(String[] args) {
    int i = 0;
    int iCopy = 0; // Mutant: Duplicate of the i assignment
    System.out.println(i);
  }
}