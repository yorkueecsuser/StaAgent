class ThreadSafe {
  protected int x;

  protected int y;

  public synchronized void setX(int x) {
    this.x = x;
    this.x = x; // Mutation: Duplicate assignment statement
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.x = x; // Mutation: Duplicate assignment statement
    this.y = y;
    this.y = y; // Mutation: Duplicate assignment statement
  }

  public synchronized int getY() {
    return y;
  }
}