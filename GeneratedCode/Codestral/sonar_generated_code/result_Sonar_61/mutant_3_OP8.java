class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val;
  }

  public void setY(int val) { // Mutant: Renaming y to z
    this.z = val;
  }

  public int getY() {
    return this.x;
  }

  public int getZ() { // Mutant: Renaming getY to getZ
    return this.y;
  }

  // This method demonstrates the bug
  public void showBug() {
    setX(10);
    setZ(10); // Mutant: Renaming setY to setZ
    System.out.println("Expected 'x' to be 10, but got: " + x);
    System.out.println("Expected 'z' to be 10, but got: " + getZ()); // Mutant: Renaming getY to getZ
  }
}