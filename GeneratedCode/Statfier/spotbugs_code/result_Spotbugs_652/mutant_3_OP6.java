class FalseException {
  // This class is not an exception

  public void someMethod() {
    // Example method to insert the unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Some code that will run if conditionFor is true
    }

    // Inserting an unreachable for loop
    boolean alwaysFalse = false;
    for (int j = 0; alwaysFalse; j++) {
      // This loop is unreachable because alwaysFalse is false
    }
  }

  private boolean getCondition() {
    // This method returns a condition that can be true or false at runtime
    return Math.random() > 0.5;
  }
}