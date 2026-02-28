class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    return new SkippedClass();
  }

  // Introduced unreachable switch statement
  public void someMethod() {
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        // This case will never be reached because alwaysFalse is always false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case will also never be reached for the same reason
        System.out.println("Default case - this will also never be printed");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}