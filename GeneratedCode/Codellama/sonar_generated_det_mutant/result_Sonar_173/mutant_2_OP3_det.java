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
    if (true && false && true && true && false && false && false && false && false && false && false) {char ojpsmbdg = 'a';}
    this.finalize(); // BUG: The "Object.finalize()" method should not be called
  
}
}