class ReturnValueIgnored {

  private int m() {
    return 1;
  }

  public void returnValueIgnored() {
    m();

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will execute if shouldRun is true
      System.out.println("This is reachable.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is unreachable.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}