class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) { // BUG: Getters and setters should access the expected fields
    boolean shouldUpdateY = getCondition(); // Dynamically determined condition
    if (shouldUpdateY) {
      this.y = val; // This line updates the wrong field
    }
  }

  public int getY() { // BUG: Getters and setters should access the expected fields
    boolean shouldReturnX = getCondition(); // Dynamically determined condition
    if (shouldReturnX) {
      return this.x; // This line returns the wrong field
    } else {
      return 0; // Unreachable else branch
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
    // This method can be implemented to return a dynamic condition
    return false; // For demonstration purposes, always returns false
  }
}