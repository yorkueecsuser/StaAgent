class FalseException {
  // This class is not an exception

  public void someMethod() {
    // Example method to insert the mutant into
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is the reachable part.");
    } else {
      System.out.println("This is the alternative reachable part.");
    }

    // Inserting an unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is the unreachable part.");
    } else {
      System.out.println("This is the alternative unreachable part.");
    }
  }

  private boolean getCondition() {
    // This method returns a condition that can be true or false at runtime
    return true;
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if-else branch unreachable
    return false;
  }
}