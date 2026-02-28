class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) { // BUG: Getters and setters should access the expected fields
    this.y = val; // This line updates the wrong field
    // Mutant: Renaming 'y' to 'a'
    this.a = val; 
  }

  public int getY() { // BUG: Getters and setters should access the expected fields
    return this.x; // This line returns the wrong field
    // Mutant: Renaming 'x' to 'b'
    return this.b; 
  }

  public int showBug() {
    setX(10); // Setting x to 10, but actually setting y
    // Mutant: Renaming 'y' to 'c'
    setC(10);
    return getY(); // Returning y, but expecting x
    // Mutant: Renaming 'x' to 'd'
    return getD();
  }

  public static void main(String[] args) {
    BuggyClass buggy = new BuggyClass();
    System.out.println(buggy.showBug()); // This will print 0, demonstrating the bug
    // Mutant: Renaming 'buggy' to 'e'
    BuggyClass e = new BuggyClass();
    System.out.println(e.showBug());
  }

  // Mutant: Adding new methods to support renaming
  public void setC(int val) {
    this.y = val;
  }

  public int getD() {
    return this.x;
  }
}