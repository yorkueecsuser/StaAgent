class Bug2888644 {
  private static String assignMe = null;

  public void bug1() {
    assignMe = "OK";
  }

  public void bug2() {
    if (assignMe.contains("OK")) {
      System.out.println("OK!");
    }
    assignMe = "OK";

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is reachable");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}