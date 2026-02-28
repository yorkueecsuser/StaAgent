class CreateBeforeInitialization {

  static CreateBeforeInitialization foo = new CreateBeforeInitialization();

  static int x = 42;

  // Introduced an unreachable if-else statement
  static {
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      x = 100;
    } else {
      // This block will also never execute because getCondition() always returns false
      x = 200;
    }
  }

  // Method to provide a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}