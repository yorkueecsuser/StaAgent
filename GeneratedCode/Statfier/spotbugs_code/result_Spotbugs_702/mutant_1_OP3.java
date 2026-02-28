class Ideas_2009_06_16 {

  private int x, y;

  Ideas_2009_06_16(int x, int y) {
    this.x = x;
    this.x = y;
    
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      this.y = x + y;
    }
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}