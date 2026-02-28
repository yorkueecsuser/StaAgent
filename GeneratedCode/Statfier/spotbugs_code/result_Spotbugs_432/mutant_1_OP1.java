class ThreadSafe {
  protected int x;

  protected int y;

  public synchronized void setX(int x) {
    this.x = x;
    // Dead store mutation
    String jhgfvdcb = "unused";
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.y = y;
    // Dead store mutation
    int qazwsxed = 42;
  }

  public synchronized int getY() {
    return y;
  }
}