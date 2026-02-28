class Ideas_2009_06_16 {

  private int x, y;

  Ideas_2009_06_16(int x, int y) {
    this.x = x;
    this.x = y;
    
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        this.x = 100;
        break;
      case 1:
        // This case is always executed
        this.y = 200;
        break;
    }
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}