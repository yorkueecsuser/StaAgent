class Bug2845646 {
  public static int compare(String arg0, String arg1) {
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return -999;
    }

    if (null == arg0 && null!= arg1) {
      return -1;
    }
    if (null!= arg0 && null == arg1) {
      return 1;
    }
    if (null == arg0 && null == arg1) {
      return 0;
    }
    return arg0.compareToIgnoreCase(arg1);
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}