class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) { // BUG: Getters and setters should access the expected fields
    this.y = val; // This line updates the wrong field

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      this.x = val;
    } else {
      // Alternative code that does nothing
      // This block is also intended to be unreachable
      this.y = val + 1;
    }
  }

  public int getY() { // BUG: Getters and setters should access the expected fields
    return this.x; // This line returns the wrong field

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      return this.y;
    } else {
      // Alternative code that does nothing
      // This block is also intended to be unreachable
      return this.x + 1;
    }
  }

  public int showBug() {
    setX(10); // Setting x to 10, but actually setting y
    return getY(); // Returning y, but expecting x

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      return 20;
    } else {
      // Alternative code that does nothing
      // This block is also intended to be unreachable
      return 30;
    }
  }

  public static void main(String[] args) {
    BuggyClass buggy = new BuggyClass();
    System.out.println(buggy.showBug()); // This will print 0, demonstrating the bug

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This should not be printed");
    } else {
      // Alternative code that does nothing
      // This block is also intended to be unreachable
      System.out.println("This should also not be printed");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, making the if-else branches unreachable
  }
}