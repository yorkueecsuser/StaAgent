class FalseException {
  // This class is not an exception

  public void someMethod() {
    // Example method to insert the unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This loop is unreachable");
    }
  }

  private boolean getCondition() {
    // This method returns false, making the while loop condition always false
    return false;
  }
}