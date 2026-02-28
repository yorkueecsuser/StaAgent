class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) {
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

  // Mutated code based on Renaming Mutation Operator
  private int a;

  public void setA(int val) {
    this.a = val;
  }

  public int getA() {
    return this.y;
  }

  public void showMutantBug() {
    setA(10);
    System.out.println("Expected 'a' to be 10, but got: " + a);
    System.out.println("Expected 'y' to be 10, but got: " + getA());
  }
}