class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x; // Bug: should be this.x = y;
    z = 32;

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      z = 42;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}