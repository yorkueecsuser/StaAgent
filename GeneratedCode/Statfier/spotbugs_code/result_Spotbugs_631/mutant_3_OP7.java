class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x; // Bug: should be this.x = y;
    z = 32;

    // Introduced unreachable while loop according to mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
      System.out.println("This loop is unreachable");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}