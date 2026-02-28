class BuggyClass {
  private int x;
  private int y;

  private boolean getCondition() {
    return false;
  }

  public void setX(int val) {
    for (int i = 0; getCondition(); i++) { // Unreachable for loop
      System.out.println("This code is unreachable");
    }
    this.y = val;
  }

  public int getY() {
    return this.x;
  }

  // This method demonstrates the bug
  public void showBug() {
    setX(10);
    System.out.println("Expected 'x' to be 10, but got: " + x);
    System.out.println("Expected 'y' to be 10, but got: " + getY());
  }
}