class ThreadSafe {
  protected int x;

  protected int y;

  public synchronized void setX(int x) {
    this.x = x;
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public synchronized int getY() {
    return y;
  }

  // Mutated code
  protected int a;

  protected int b;

  public synchronized void setA(int a) {
    this.a = a;
  }

  public synchronized int getA() {
    return a;
  }

  public synchronized void setAB(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public synchronized int getB() {
    return b;
  }
}