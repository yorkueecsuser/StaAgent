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

  public void unreachableIfElse(int value) {
    if (value == 1) {
      // unreachable code
      System.out.println("This is unreachable code");
    } else if (value == 2) {
      // normal code
      System.out.println("This is normal code");
    } else {
      // unreachable code
      System.out.println("This is also unreachable code");
    }
  }
}