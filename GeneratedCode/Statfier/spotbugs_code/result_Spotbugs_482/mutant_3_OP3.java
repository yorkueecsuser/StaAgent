class CreateBeforeInitialization {

  static CreateBeforeInitialization foo = new CreateBeforeInitialization();

  static int x = 42;

  // Added mutant code with an unreachable if statement
  static {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      x = 100;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}