class ThreadSafe {
  protected int x;

  protected int y;

  // Method to provide a dynamic condition for mutation
  private boolean getCondition() {
    return false; // This will always return false, ensuring the if-else branch is unreachable
  }

  public synchronized void setX(int x) {
    this.x = x;
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      this.x = 0; // Unreachable code
    } else {
      this.x = -1; // Unreachable code
    }
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.y = y;
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      this.x = 0; // Unreachable code
      this.y = 0; // Unreachable code
    } else {
      this.x = -1; // Unreachable code
      this.y = -1; // Unreachable code
    }
  }

  public synchronized int getY() {
    return y;
  }
}