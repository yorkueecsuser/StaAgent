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

  // Unreachable while loop mutation
  public void unreachableWhileLoop() {
    boolean condition = getCondition();
    while (condition) {
      // This code will never be executed
      System.out.println("This is unreachable code.");
    }
  }
}