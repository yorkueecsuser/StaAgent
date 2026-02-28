class ThreadSafe {
  protected int x;

  protected int y;

  public synchronized void setX(int x) {
    this.x = x;
    this.x = x; // Mutant: duplicated assignment
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.x = x; // Mutant: duplicated assignment
    this.y = y;
    this.y = y; // Mutant: duplicated assignment
  }

  public synchronized int getY() {
    return y;
  }
}