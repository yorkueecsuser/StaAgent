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

    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never execute because shouldRun is always false
      System.out.println("This is an unreachable else block");
    }
  }

  private boolean getCondition() {
    return false;
  }
}