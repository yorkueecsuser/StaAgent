class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) {
    boolean unreachableCondition = getUnreachableCondition(); // Assuming getUnreachableCondition() is a method that returns false
    if (unreachableCondition) {
      System.out.println("This code should never execute");
    } else {
      this.y = val;
    }
  }

  // getUnreachableCondition() is a made-up method for the purpose of this example
  private boolean getUnreachableCondition() {
    return false;
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