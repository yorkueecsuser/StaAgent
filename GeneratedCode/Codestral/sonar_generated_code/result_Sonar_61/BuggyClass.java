class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) {
    // Inserted unreachable while loop
    boolean loopCondition = getCondition();
    while (loopCondition) {
        // This code will never be executed
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

  // Method to return false for the loop condition
  private boolean getCondition() {
    return false;
  }
}