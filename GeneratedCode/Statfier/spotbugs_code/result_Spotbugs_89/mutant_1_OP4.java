class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;
    
    // Introduced an unreachable if-else statement with a dynamic condition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      x = 5;
    } else {
      // This block will also never execute because shouldRun is always false
      x = 10;
    }
    
    return x;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}