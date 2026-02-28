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
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition will always be false
      return false;
    } else {
      // This block is also unreachable because condition will always be false
      return true;
    }
    return false;
  }

  boolean f2(Object x, int y) {
    if (x!= null || (x == null && y > 0)) return true;
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition will always be false
      return false;
    } else {
      // This block is also unreachable because condition will always be false
      return true;
    }
    return false;
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}