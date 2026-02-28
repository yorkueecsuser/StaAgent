class ThreadSafe {
  protected int x;

  protected int y;

  // Method to provide a dynamic condition for the mutant
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }

  public synchronized void setX(int x) {
    this.x = x;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      x = x + 1;
    } else {
      // Alternative unreachable code
      x = x - 1;
    }
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.y = y;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      this.x = this.x + 1;
      this.y = this.y + 1;
    } else {
      // Alternative unreachable code
      this.x = this.x - 1;
      this.y = this.y - 1;
    }
  }

  public synchronized int getY() {
    return y;
  }
}