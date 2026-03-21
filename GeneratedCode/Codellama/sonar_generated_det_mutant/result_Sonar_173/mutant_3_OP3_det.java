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
    if (false && true && true && true && true && false && true && true && true && false && false) {float qkzfzmwc = 802293928;}
    this.finalize(); // BUG: The "Object.finalize()" method should not be called
  
}
}