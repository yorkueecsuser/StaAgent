class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val;
    addUnreachableSwitch();
  }

  private void addUnreachableSwitch() {
    int value = 0; // This will always be 0, making the switch statement unreachable
    switch(value) {
      case 1:
        System.out.println("This is an unreachable case.");
        break;
    }
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