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
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }

    if (x!= null || (x == null && y > 0)) return true;
    return false;
  }

  boolean f2(Object x, int y) {
    // Introduced unreachable while loop
    boolean conditionWhile2 = getCondition();
    while (conditionWhile2) {
      // Unreachable code
    }

    if (x!= null || (x == null && y > 0)) return true;
    return false;
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}