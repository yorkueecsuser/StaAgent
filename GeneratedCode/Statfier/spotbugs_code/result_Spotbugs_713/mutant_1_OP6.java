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
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return false;
  }

  boolean f2(Object x, int y) {
    if (x!= null || (x == null && y > 0)) return true;
    // Inserting unreachable for loop
    boolean conditionFor2 = getCondition();
    for (int i = 0; conditionFor2; i++) {
      // Unreachable code
    }
    return false;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, making the loop unreachable
  }
}