class MutatedClass {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val;
    boolean unreachableCondition = getCondition();
    if (unreachableCondition) {
        System.out.println("This is an unreachable block of code.");
    }
  }

  public int getY() {
    return this.x;
  }

  // This method demonstrates the bug and the mutant
  public void showBug() {
    setX(10);
    System.out.println("Expected 'x' to be 10, but got: " + x);
    System.out.println("Expected 'y' to be 10, but got: " + getY());
  }

  private boolean getCondition() {
      return false;
  }
}