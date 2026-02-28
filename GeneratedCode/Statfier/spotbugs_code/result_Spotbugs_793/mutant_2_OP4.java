class Issue758 {

  public void method() {
    Object[] array = new String[3];
    Object[] objects = (Object[]) array;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will execute if shouldRun is true
      System.out.println("This block is reachable.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This block is unreachable.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false at runtime
  }
}