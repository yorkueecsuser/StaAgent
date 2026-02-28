class ThreadSafe {
  protected int x;

  protected int y;

  // Method to provide a dynamic condition for the unreachable for loop
  private boolean getUnreachableCondition() {
    return false;
  }

  public synchronized void setX(int x) {
    this.x = x;
    // Inserting an unreachable for loop
    boolean conditionFor = getUnreachableCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop will never execute
    }
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.y = y;
    // Inserting an unreachable for loop
    boolean conditionFor = getUnreachableCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop will never execute
    }
  }

  public synchronized int getY() {
    return y;
  }
}