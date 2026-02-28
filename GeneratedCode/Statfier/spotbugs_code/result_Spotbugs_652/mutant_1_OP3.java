class FalseException {
  // This class is not an exception

  public void someMethod() {
    // Example method to insert the mutant
    boolean condition = getCondition();
    if (condition) {
      // Some code here
    }
    // Inserting unreachable if statement
    boolean unreachableCondition = isUnreachable();
    if (unreachableCondition) {
      // This block is unreachable
      System.out.println("This is an unreachable statement");
    }
  }

  private boolean getCondition() {
    // Method to simulate a dynamic condition
    return true;
  }

  private boolean isUnreachable() {
    // Method to simulate a condition that is always false
    return false;
  }
}