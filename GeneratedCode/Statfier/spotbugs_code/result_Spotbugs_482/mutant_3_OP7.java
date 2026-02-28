class CreateBeforeInitialization {

  static CreateBeforeInitialization foo = new CreateBeforeInitialization();

  static int x = 42;

  // Inserting an unreachable while loop
  static {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will always be false
      System.out.println("This will never be printed");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}