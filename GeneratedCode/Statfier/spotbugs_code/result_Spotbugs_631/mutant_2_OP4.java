class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x; // Original bug: should be 'this.x = y;'
    z = 32;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      z = 42;
    } else {
      // This block is unreachable because shouldRun is always false
      z = 99;
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // Always returns false, making the else block unreachable
  }
}