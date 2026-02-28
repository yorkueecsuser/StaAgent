class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val;
    int deadStore = 0; // Dead Store mutation: an unused variable declaration
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