class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) { // BUG: Getters and setters should access the expected fields
    boolean condition = getCondition(); // Dynamically determined condition
    if (condition) {
      this.y = val; // This line updates the wrong field
    } else {
      // Unreachable if-else branch
      this.x = val; // This line would update the correct field if reachable
    }
  }

  public int getY() { // BUG: Getters and setters should access the expected fields
    boolean condition = getCondition(); // Dynamically determined condition
    if (condition) {
      return this.x; // This line returns the wrong field
    } else {
      // Unreachable if-else branch
      return this.y; // This line would return the correct field if reachable
    }
  }

  public int showBug() {
    setX(10); // Setting x to 10, but actually setting y
    return getY(); // Returning y, but expecting x
  }

  public static void main(String[] args) {
    BuggyClass buggy = new BuggyClass();
    System.out.println(buggy.showBug()); // This will print 0, demonstrating the bug
  }

  private boolean getCondition() {
    // This method provides a dynamic condition that is always false
    return false;
  }
}