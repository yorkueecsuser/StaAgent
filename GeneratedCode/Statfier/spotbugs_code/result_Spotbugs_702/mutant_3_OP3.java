class Ideas_2009_06_16 {

  private int x, y;

  Ideas_2009_06_16(int x, int y) {
    this.x = x;
    this.x = y;
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      this.y = x + y;
    }
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  private boolean getCondition() {
    // This method always returns false, making the if statement unreachable
    return false;
  }
}