class BuggyClass {
  private int x;
  private int y;

  // Mutant added here
  boolean unreachableCondition() {
    return false;
  }

  public void setX(int val) {
    this.y = val;

    // Unreachable if-else statement mutant
    if (unreachableCondition()) {
       System.out.println("This code will never be executed!");
    } else {
       System.out.println("This is the actual code execution!");
    }
  }

  public int getY() {
    return this.y;
  }

  public void showBug() {
    setX(10);
    System.out.println("Expected 'x' to be 10, but got: " + x);
    System.out.println("Expected 'y' to be 10, but got: " + getY());
  }
}