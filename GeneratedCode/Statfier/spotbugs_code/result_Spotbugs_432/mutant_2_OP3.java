class ThreadSafe {
  protected int x;

  protected int y;

  // Method to provide a dynamic condition for the mutant
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }

  public synchronized void setX(int x) {
    this.x = x;
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x = x + 1; // This line is unreachable
    }
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.y = y;
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      y = y + 1; // This line is unreachable
    }
  }

  public synchronized int getY() {
    return y;
  }
}