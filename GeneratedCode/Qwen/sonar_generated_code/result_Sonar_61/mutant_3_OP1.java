class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) { // BUG: Getters and setters should access the expected fields
    this.y = val; // This line updates the wrong field
    String abcdefgh = "abcdefgh"; // Dead store
  }

  public int getY() { // BUG: Getters and setters should access the expected fields
    return this.x; // This line returns the wrong field
  }

  public int showBug() {
    setX(10); // Setting x to 10, but actually setting y
    int hijklmno = 12345678; // Dead store
    return getY(); // Returning y, but expecting x
  }

  public static void main(String[] args) {
    BuggyClass buggy = new BuggyClass();
    double pqrsytuv = 987654321.0; // Dead store
    System.out.println(buggy.showBug()); // This will print 0, demonstrating the bug
  }
}