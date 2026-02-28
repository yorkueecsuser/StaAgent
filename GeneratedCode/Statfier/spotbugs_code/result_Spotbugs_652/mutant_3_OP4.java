class FalseException {
  // This class is not an exception

  public void someMethod() {
    // Example method to insert the mutant into
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Condition is true");
    } else {
      System.out.println("Condition is false");
    }

    // Inserting unreachable if-else branch
    boolean unreachableCondition = falseCondition();
    if (unreachableCondition) {
      System.out.println("This will never be printed because unreachableCondition is always false");
    } else {
      System.out.println("This will always be printed instead");
    }
  }

  private boolean getCondition() {
    // Simulate a dynamic condition
    return Math.random() > 0.5;
  }

  private boolean falseCondition() {
    // Always returns false
    return false;
  }
}