class A {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val; // BUG: Getters and setters should access the expected fields
  }

  public int getY() {
    return this.x; // BUG: Getters and setters should access the expected fields
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }

  // Mutant 1: Unreachable for loop
  public void showBugMutant1() {
    boolean conditionFor = getCondition(); // Generate random boolean value
    for (int i = 0; conditionFor; i++) {
      // Empty loop body
    }
    setX(10);
    System.out.println(getY());
  }

  // Mutant 2: Unreachable if-else statement
  public void showBugMutant2() {
    boolean shouldRun = getCondition(); // Generate random boolean value
    if (shouldRun) {
      setX(10);
      System.out.println(getY());
    } else {
      // Empty else block
    }
  }

  // Helper method to generate random boolean value
  private boolean getCondition() {
    return Math.random() < 0.5;
  }
}