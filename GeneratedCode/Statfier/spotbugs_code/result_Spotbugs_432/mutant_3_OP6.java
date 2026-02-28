class ThreadSafe {
  protected int x;

  protected int y;

  public synchronized void setX(int x) {
    this.x = x;
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.y = y;
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  public synchronized int getY() {
    return y;
  }

  private boolean getCondition() {
    // This method always returns false, making the for loop condition always false
    return false;
  }
}