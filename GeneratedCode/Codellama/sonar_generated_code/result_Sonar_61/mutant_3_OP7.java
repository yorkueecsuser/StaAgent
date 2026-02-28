class A {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val; // BUG: Getters and setters should access the expected fields
  }

  public int getY() {
    return this.x; // BUG: Getters and setters should access the expected fields
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }

  // Mutant code: Unreachable while loop
  public void unreachableWhileLoop() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code here
    }
  }
}