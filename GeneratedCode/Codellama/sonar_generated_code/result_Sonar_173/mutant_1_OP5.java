class BuggyExample {
  public static void main(String[] args) {
    BuggyExample buggy = new BuggyExample();
    try {
      buggy.dispose();
    } catch (Throwable e) {
      System.out.println("Error disposing object: " + e.getMessage());
    }
  }

  public void dispose() throws Throwable {
    this.finalize(); // BUG: The "Object.finalize()" method should not be called
  }

  public void unreachableSwitchStatement() {
    boolean condition = false;
    switch (condition) {
      case true: // Unreachable code
        System.out.println("This code will never execute.");
        break;
    }
  }
}