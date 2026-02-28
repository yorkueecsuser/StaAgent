class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) { // BUG: Getters and setters should access the expected fields
    this.y = val; // This line updates the wrong field

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      this.x = val; // This line is unreachable
    }
  }

  public int getY() { // BUG: Getters and setters should access the expected fields
    return this.x; // This line returns the wrong field

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return this.y; // This line is unreachable
    }
    return 0; // Ensure there's a reachable return statement
  }

  public int showBug() {
    setX(10); // Setting x to 10, but actually setting y
    return getY(); // Returning y, but expecting x

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      return 42; // This line is unreachable
    }
    return 0; // Ensure there's a reachable return statement
  }

  public static void main(String[] args) {
    BuggyClass buggy = new BuggyClass();
    System.out.println(buggy.showBug()); // This will print 0, demonstrating the bug

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable"); // This line is unreachable
    }
  }

  // Method to provide a dynamic condition for the if statements
  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}