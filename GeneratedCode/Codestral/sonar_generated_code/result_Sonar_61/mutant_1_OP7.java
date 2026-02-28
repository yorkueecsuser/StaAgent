class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) {
    boolean condition = getCondition();
    while (condition) { // Mutant: Unreachable while loop
      System.out.println("This code is unreachable.");
    }
    this.y = val;
  }

  private boolean getCondition() {
    return false; // This condition ensures the while loop is unreachable
  }

  public int getY() {
    return this.x;
  }

  public void showBug() {
    setX(10);
    System.out.println("Expected 'x' to be 10, but got: " + x);
    System.out.println("Expected 'y' to be 10, but got: " + getY());
  }
}