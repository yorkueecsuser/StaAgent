class CreateBeforeInitialization {

  static CreateBeforeInitialization foo = new CreateBeforeInitialization();

  static int x = 42;

  // Mutant code added here
  static {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
      System.out.println("This is reachable code.");
    } else {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is unreachable code.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}