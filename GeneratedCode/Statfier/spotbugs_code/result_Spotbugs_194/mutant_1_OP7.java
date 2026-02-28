class Bug2888644 {
  private static String assignMe = null;

  public void bug1() {
    assignMe = "OK";
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable code in bug1");
    }
  }

  public void bug2() {
    if (assignMe.contains("OK")) {
      System.out.println("OK!");
    }
    assignMe = "OK";
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable code in bug2");
    }
  }

  private boolean getCondition() {
    return false;
  }
}