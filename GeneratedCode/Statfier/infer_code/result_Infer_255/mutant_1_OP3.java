public enum ResType {
  SOME,
  NONE;

  // Added mutant code with an unreachable if statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will run if condition is true
      System.out.println("This is reachable code.");
    }
    // Unreachable if statement
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // This code is unreachable
      System.out.println("This is unreachable code.");
    }
  }

  private boolean getCondition() {
    // This method returns a dynamic condition
    return true;
  }
}