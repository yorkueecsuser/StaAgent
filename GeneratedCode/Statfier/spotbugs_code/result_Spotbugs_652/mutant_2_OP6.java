class FalseException {
  // This class is not an exception

  public void someMethod() {
    // Example method to insert the unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop will run based on the dynamic condition
      System.out.println("This is a reachable loop.");
    }

    // Inserting an unreachable for loop
    boolean unreachableCondition = false;
    for (int i = 0;!unreachableCondition; i++) {
      // This loop will never run because the condition is always false
      System.out.println("This is an unreachable loop.");
    }
  }

  private boolean getCondition() {
    // Method to provide a dynamic condition
    return true;
  }
}