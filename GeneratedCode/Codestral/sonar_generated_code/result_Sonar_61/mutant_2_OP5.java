class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) {
    // Inserted unreachable switch statement
    boolean condition = false;
    switch (condition? 1 : 0) {
      case 1:
        System.out.println("This line should never be executed");
        break;
    }
    this.y = val;
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