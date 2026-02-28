class FalseException {
  // This class is not an exception

  public void someMethod() {
    // Example method to insert the unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getCondition() {
    // This method returns false, making the while loop unreachable
    return false;
  }
}