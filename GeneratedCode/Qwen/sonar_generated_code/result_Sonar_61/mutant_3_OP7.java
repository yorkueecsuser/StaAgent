class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) { // BUG: Getters and setters should access the expected fields
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    this.y = val; // This line updates the wrong field
  }

  public int getY() { // BUG: Getters and setters should access the expected fields
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return this.x; // This line returns the wrong field
  }

  public int showBug() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    setX(10); // Setting x to 10, but actually setting y
    return getY(); // Returning y, but expecting x
  }

  public static void main(String[] args) {
    BuggyClass buggy = new BuggyClass();
    boolean conditionWhile = buggy.getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println(buggy.showBug()); // This will print 0, demonstrating the bug
  }

  private boolean getCondition() {
    return false; // This method returns false, making the while loop conditionally unreachable
  }
}