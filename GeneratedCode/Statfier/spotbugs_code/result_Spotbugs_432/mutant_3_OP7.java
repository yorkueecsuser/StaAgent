class ThreadSafe {
  protected int x;

  protected int y;

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This method always returns false, making the loop condition dynamically determined
  }

  public synchronized void setX(int x) {
    this.x = x;
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute
      System.out.println("This is an unreachable while loop in setX");
    }
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.y = y;
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute
      System.out.println("This is an unreachable while loop in setXY");
    }
  }

  public synchronized int getY() {
    return y;
  }
}