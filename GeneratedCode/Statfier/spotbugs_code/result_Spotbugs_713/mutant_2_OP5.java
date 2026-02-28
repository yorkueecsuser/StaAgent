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
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be reached because condition is always false
        System.out.println("This is unreachable");
        break;
    }
    
    return false;
  }

  boolean f2(Object x, int y) {
    if (x!= null || (x == null && y > 0)) return true;
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be reached because condition is always false
        System.out.println("This is also unreachable");
        break;
    }
    
    return false;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}