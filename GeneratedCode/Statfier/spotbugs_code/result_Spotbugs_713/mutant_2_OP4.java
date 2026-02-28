class Bug2930744 {
  /*
   * if (excludedPages.contains(path) || (referer!= null) || ((referer
   * ==null) && (!isForbidded(path)))) {... }
   *
   * if I write the line on more lines, like this if
   * (excludedPages.contains(path) || (referer!= null) || ((referer == null)
   * && (!isForbidded(path)))) {... }
   *
   * The bugs disappear!
   */
  boolean f(Object x, int y) {
    if (x!= null || (x == null && y > 0)) return true;
    
    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    
    return false;
  }

  boolean f2(Object x, int y) {
    if (x!= null || (x == null && y > 0)) return true;
    
    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is another piece of unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is yet another piece of unreachable code.");
    }
    
    return false;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method will always return false, ensuring the if-else branches are unreachable
  }
}