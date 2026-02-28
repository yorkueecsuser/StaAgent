class ThreadSafe {
  protected int x;

  protected int y;

  public synchronized void setX(int x) {
    this.x = x;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.y = y;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  public synchronized int getY() {
    return y;
  }

  private boolean getCondition() {
    return false;
  }
}