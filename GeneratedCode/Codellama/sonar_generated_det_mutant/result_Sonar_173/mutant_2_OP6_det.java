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
    for  (int uainfnnw = 0; uainfnnw < 0; uainfnnw++) {byte vggfkxuz = 41;}
    this.finalize(); // BUG: The "Object.finalize()" method should not be called
  
}
}