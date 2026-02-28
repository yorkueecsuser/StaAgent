class ThreadSafe {
  protected int x;

  protected int y;

  public synchronized void setX(int x) {
    this.x = x;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      this.x = 0;
    }
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.y = y;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      this.y = 0;
    }
  }

  public synchronized int getY() {
    return y;
  }

  private boolean getCondition() {
    // This method returns false, making the if statement unreachable
    return false;
  }
}