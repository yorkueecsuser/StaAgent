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

    // Mutant code: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is unreachable!");
    } else {
      // Alternative code that also won't execute due to the same reason
      System.out.println("This is also unreachable!");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}