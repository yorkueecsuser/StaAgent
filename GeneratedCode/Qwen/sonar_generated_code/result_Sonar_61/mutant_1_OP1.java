class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) { // BUG: Getters and setters should access the expected fields
    this.y = val; // This line updates the wrong field
    String qwerasdf = "unused"; // Dead store mutation
  }

  public int getY() { // BUG: Getters and setters should access the expected fields
    return this.x; // This line returns the wrong field
    int hjklzxcv = 42; // Dead store mutation
  }

  public int showBug() {
    setX(10); // Setting x to 10, but actually setting y
    return getY(); // Returning y, but expecting x
    double tyuiopnm = 3.14; // Dead store mutation
  }

  public static void main(String[] args) {
    BuggyClass buggy = new BuggyClass();
    System.out.println(buggy.showBug()); // This will print 0, demonstrating the bug
    boolean cvbnmghj = true; // Dead store mutation
  }
}