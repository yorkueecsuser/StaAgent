class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    return new SkippedClass();
  }

  // Introduced mutant: Unreachable switch statement
  public void someMethod() {
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        // This case will never be executed because alwaysFalse is always false
        System.out.println("This will never print");
        break;
      default:
        // Default case will also never be executed due to the nature of the switch expression
        System.out.println("This will also never print");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}