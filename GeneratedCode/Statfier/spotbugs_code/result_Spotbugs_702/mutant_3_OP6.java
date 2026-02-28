class Ideas_2009_06_16 {

  private int x, y;

  Ideas_2009_06_16(int x, int y) {
    this.x = x;
    this.x = y;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  private boolean getCondition() {
    // This method returns false, making the for loop unreachable
    return false;
  }
}