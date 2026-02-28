class BuggyClass {
  private int a; // Renamed x to a
  private int b; // Renamed y to b

  public void setX(int val) {
    this.b = val; // Changed y to b
  }

  public int getY() {
    return this.a; // Changed x to a
  }

  // This method demonstrates the bug with the renamed variables
  public void showBug() {
    setX(10);
    System.out.println("Expected 'a' to be 10, but got: " + a);
    System.out.println("Expected 'b' to be 10, but got: " + getY());
  }
}