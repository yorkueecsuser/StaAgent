class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x;
    z = 32;

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      z = 42;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}