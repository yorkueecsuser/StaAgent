class Ideas_2009_06_16 {

  private int x, y;

  Ideas_2009_06_16(int x, int y) {
    this.x = x;
    this.x = y; // Original buggy assignment
    this.x = y; // Duplicated assignment
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}