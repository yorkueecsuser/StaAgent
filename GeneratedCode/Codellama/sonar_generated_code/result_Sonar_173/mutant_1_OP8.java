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

  // Mutant 1: Renaming user-defined variable "this" to "a"
  public void dispose() throws Throwable {
    a.finalize(); // BUG: The "Object.finalize()" method should not be called
  }

  // Mutant 2: Renaming user-defined variable "this" to "b"
  public void dispose() throws Throwable {
    b.finalize(); // BUG: The "Object.finalize()" method should not be called
  }

  // Mutant 3: Renaming user-defined variable "this" to "c"
  public void dispose() throws Throwable {
    c.finalize(); // BUG: The "Object.finalize()" method should not be called
  }
}