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
}

// Inserted if statement to make the dispose() method unreachable
if (false) {
  this.dispose();
} else {
  System.out.println("Disposing object...");
}