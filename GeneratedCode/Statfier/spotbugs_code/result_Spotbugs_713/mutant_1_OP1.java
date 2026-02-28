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
    // Dead store mutation
    String qvbnrhty = "unusedVariable";
    if (x!= null || (x == null && y > 0)) return true;
    return false;
  }

  boolean f2(Object x, int y) {
    // Dead store mutation
    int zxcvbnml = 42;
    if (x!= null || (x == null && y > 0)) return true;
    return false;
  }
}