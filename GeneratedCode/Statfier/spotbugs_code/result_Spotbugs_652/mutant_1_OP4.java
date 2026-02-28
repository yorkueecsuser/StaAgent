class FalseException {
  // This class is not an exception

  public void someMethod() {
    // Example method to insert the mutant into
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code here
    } else {
      // Alternative code here
    }

    // Inserting unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed");
    } else {
      // This block is also intended to be unreachable
      System.out.println("This should also never be printed");
    }
  }

  private boolean getCondition() {
    // Method to return a condition
    return true;
  }

  private boolean getUnreachableCondition() {
    // Method to return a condition that will always be false
    return false;
  }
}