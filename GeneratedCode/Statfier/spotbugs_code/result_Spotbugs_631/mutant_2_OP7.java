class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x;
    z = 32;

    // Introduced unreachable while loop as per mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}