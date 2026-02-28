class Bug2888644 {
  private static String assignMe = null;

  public void bug1() {
    assignMe = "OK";
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
  }

  public void bug2() {
    if (assignMe.contains("OK")) {
      System.out.println("OK!");
    }
    assignMe = "OK";
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is also unreachable");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}