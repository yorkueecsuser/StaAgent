class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val;
    unreachableSwitch(val);
  }

  public int getY() {
    unreachableSwitch(x);
    return this.x;
  }

  private void unreachableSwitch(int val) {
    boolean shouldRun = false;
    if (shouldRun) {
      switch (val) {
        case 1:
          // Unreachable code
          System.out.println("This is an unreachable switch statement.");
          break;
        default:
          break;
      }
    }
  }

  public void showBug() {
    setX(10);
    System.out.println("Expected 'x' to be 10, but got: " + x);
    System.out.println("Expected 'y' to be 10, but got: " + getY());
  }
}