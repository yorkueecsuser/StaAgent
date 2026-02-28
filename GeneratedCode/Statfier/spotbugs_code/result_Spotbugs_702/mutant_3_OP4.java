class Ideas_2009_06_16 {

  private int x, y;

  Ideas_2009_06_16(int x, int y) {
    this.x = x;
    this.x = y;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      this.x = 0;
    } else {
      // Alternative code that should also never run
      this.y = 0;
    }
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else block unreachable
    return false;
  }
}