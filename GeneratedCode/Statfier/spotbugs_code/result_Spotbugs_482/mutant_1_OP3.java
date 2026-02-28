class CreateBeforeInitialization {

  static CreateBeforeInitialization foo = new CreateBeforeInitialization();

  static int x = 42;

  // Mutant code added here
  static {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable if statement");
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}