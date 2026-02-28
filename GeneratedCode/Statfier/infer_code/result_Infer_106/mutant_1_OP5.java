class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    return new SkippedClass();
  }

  // Added mutant code for Unreachable switch statement
  public void someMethod() {
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case to ensure switch is not empty and reachable
        System.out.println("Default case executed");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}