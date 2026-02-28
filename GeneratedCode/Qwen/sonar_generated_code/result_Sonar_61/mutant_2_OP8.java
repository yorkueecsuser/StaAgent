class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) { // BUG: Getters and setters should access the expected fields
    this.y = val; // This line updates the wrong field
    z = val; // Mutant: Renamed 'y' to 'z'
  }

  public int getY() { // BUG: Getters and setters should access the expected fields
    return this.x; // This line returns the wrong field
    return a; // Mutant: Renamed 'x' to 'a'
  }

  public int showBug() {
    setX(10); // Setting x to 10, but actually setting y
    return getY(); // Returning y, but expecting x
    b = 10; // Mutant: Introduced new variable 'b'
    return c; // Mutant: Introduced new variable 'c'
  }

  public static void main(String[] args) {
    BuggyClass buggy = new BuggyClass();
    System.out.println(buggy.showBug()); // This will print 0, demonstrating the bug
    d = new BuggyClass(); // Mutant: Introduced new variable 'd'
    System.out.println(d.showBug()); // Mutant: Used new variable 'd'
  }
}