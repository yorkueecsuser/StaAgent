class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) { // BUG: Getters and setters should access the expected fields
    this.y = val; // This line updates the wrong field

    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      this.x = val; // This line is unreachable
    }
  }

  public int getY() { // BUG: Getters and setters should access the expected fields
    return this.x; // This line returns the wrong field

    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return this.y; // This line is unreachable
    }
    return 0; // To avoid unreachable statement error
  }

  public int showBug() {
    setX(10); // Setting x to 10, but actually setting y
    return getY(); // Returning y, but expecting x

    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 42; // This line is unreachable
    }
    return 0; // To avoid unreachable statement error
  }

  public static void main(String[] args) {
    BuggyClass buggy = new BuggyClass();
    System.out.println(buggy.showBug()); // This will print 0, demonstrating the bug

    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable"); // This line is unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}