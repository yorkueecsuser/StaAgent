class FalseException {
  // This class is not an exception

  public void someMethod() {
    // Example method to insert the mutant code into
    boolean condition = getCondition();
    if (condition) {
      // Some code here
    }

    // Inserting unreachable if branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable because getUnreachableCondition() always returns false
      System.out.println("This will never be printed");
    }
  }

  private boolean getCondition() {
    // Some logic to determine the condition
    return true;
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}