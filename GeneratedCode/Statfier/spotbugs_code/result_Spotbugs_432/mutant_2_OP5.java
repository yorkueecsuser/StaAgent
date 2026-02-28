class ThreadSafe {
  protected int x;

  protected int y;

  public synchronized void setX(int x) {
    this.x = x;
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
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
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is another unreachable case.");
        break;
    }
  }

  public synchronized int getY() {
    return y;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}