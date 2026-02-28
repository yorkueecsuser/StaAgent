class Ideas_2009_06_16 {

  private int x, y;

  Ideas_2009_06_16(int x, int y) {
    this.x = x;
    this.x = y; // Original bug remains

    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}