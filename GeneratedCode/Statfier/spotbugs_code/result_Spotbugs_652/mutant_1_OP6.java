class FalseException {
  // This class is not an exception

  public void someMethod() {
    // Introducing an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This loop should never execute.");
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }
}