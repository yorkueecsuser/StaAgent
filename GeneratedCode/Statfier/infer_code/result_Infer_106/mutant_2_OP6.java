class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    return new SkippedClass();
  }

  // Mutant code added below
  public void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}