class ThreadSafe {
  protected int x;

  protected int y;

  // Method to provide a dynamic condition for the mutant
  private boolean getDynamicCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }

  public synchronized void setX(int x) {
    this.x = x;
    // Inserting unreachable if-else statement
    boolean shouldRun = getDynamicCondition();
    if (shouldRun) {
      System.out.println("This is unreachable code block for setX");
    } else {
      System.out.println("This is the alternative unreachable code block for setX");
    }
  }

  public synchronized int getX() {
    return x;
  }

  public synchronized void setXY(int x, int y) {
    this.x = x;
    this.y = y;
    // Inserting unreachable if-else statement
    boolean shouldRun = getDynamicCondition();
    if (shouldRun) {
      System.out.println("This is unreachable code block for setXY");
    } else {
      System.out.println("This is the alternative unreachable code block for setXY");
    }
  }

  public synchronized int getY() {
    return y;
  }
}