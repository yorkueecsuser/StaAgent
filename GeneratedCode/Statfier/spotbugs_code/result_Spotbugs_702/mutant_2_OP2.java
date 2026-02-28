class Ideas_2009_06_16 {

  private int x, y;

  Ideas_2009_06_16(int x, int y) {
    this.x = x;
    this.x = y; // Original buggy line
    this.x = y; // Duplicated line to maintain the bug
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}