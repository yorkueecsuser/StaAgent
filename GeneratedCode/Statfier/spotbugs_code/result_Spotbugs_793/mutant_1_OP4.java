class Issue758 {

  public void method() {
    Object[] array = new String[3];
    Object[] objects = (Object[]) array;

    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will execute if shouldRun is true
      System.out.println("This is reachable code.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is unreachable code.");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}