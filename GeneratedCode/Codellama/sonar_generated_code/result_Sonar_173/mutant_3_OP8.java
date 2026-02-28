// Renaming Mutant 1: Renaming variable "buggy" to "e"
class BuggyExample {
  public static void main(String[] args) {
    BuggyExample e = new BuggyExample();
    try {
      e.dispose();
    } catch (Throwable e) {
      System.out.println("Error disposing object: " + e.getMessage());
    }
  }

  public void dispose() throws Throwable {
    this.finalize(); // BUG: The "Object.finalize()" method should not be called
  }
}

// Renaming Mutant 2: Renaming variable "e" to "exception"
class BuggyExample {
  public static void main(String[] args) {
    BuggyExample exception = new BuggyExample();
    try {
      exception.dispose();
    } catch (Throwable exception) {
      System.out.println("Error disposing object: " + exception.getMessage());
    }
  }

  public void dispose() throws Throwable {
    this.finalize(); // BUG: The "Object.finalize()" method should not be called
  }
}