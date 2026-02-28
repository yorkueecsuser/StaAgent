class ThreadSafe {
  protected int x;

  protected int y;

  // Method to provide a dynamic condition for the switch statement
  private boolean getDynamicCondition() {
    return false; // This will always return false, ensuring the switch is unreachable
  }

  public synchronized void setX(int x) {
    this.x = x;
    // Inserting an unreachable switch statement
    boolean condition = getDynamicCondition();
    switch (condition) {
      case true:
        x = 0; // This case is unreachable
        break;
      default:
        x = 1; // This default case is also unreachable
        break;
    }
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.y = y;
    // Inserting an unreachable switch statement
    boolean condition = getDynamicCondition();
    switch (condition) {
      case true:
        y = 0; // This case is unreachable
        break;
      default:
        y = 1; // This default case is also unreachable
        break;
    }
  }

  public synchronized int getY() {
    return y;
  }
}