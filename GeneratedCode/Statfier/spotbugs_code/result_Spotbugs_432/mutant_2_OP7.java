class ThreadSafe {
  protected int x;

  protected int y;

  // Method to provide a dynamic condition for the unreachable while loop
  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the loop unreachable
  }

  public synchronized void setX(int x) {
    this.x = x;
    // Inserting an unreachable while loop
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // Unreachable code
      x++;
    }
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.y = y;
    // Inserting an unreachable while loop
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // Unreachable code
      y++;
    }
  }

  public synchronized int getY() {
    return y;
  }
}