class FalseException {
  // This class is not an exception

  // Added mutant code to introduce an unreachable if statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will run if condition is true
      System.out.println("This will execute if condition is true.");
    }
    // Introduced an unreachable if statement
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // This block is unreachable
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to simulate dynamic condition determination
  private boolean getCondition() {
    return true; // or any logic to determine the condition
  }
}