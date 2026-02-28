class ThreadSafe {
  protected int x;

  protected int y;

  public synchronized void setX(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    this.x = x;
  }

  public synchronized int getX() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return x;
  }

  public synchronized void setXY(int x, int y) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    this.x = x;
    this.y = y;
  }

  public synchronized int getY() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return y;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime but returns false, making the loop unreachable.
  }
}