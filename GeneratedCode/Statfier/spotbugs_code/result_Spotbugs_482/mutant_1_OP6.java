class CreateBeforeInitialization {

  static CreateBeforeInitialization foo = new CreateBeforeInitialization();

  static int x = 42;

  // Inserting an unreachable for loop based on the mutation operator description
  static {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false
    }
  }

  private static boolean getCondition() {
    return false; // This method returns false, making the loop condition always false
  }
}