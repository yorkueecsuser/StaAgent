class Ideas_2009_06_16 {

  private int x, y;

  Ideas_2009_06_16(int x, int y) {
    this.x = x;
    this.x = y;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      this.x = 0;
    } else {
      // This block will always execute
      this.y = 0;
    }
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}