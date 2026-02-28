class Bug2845646 {
  public static int compare(String arg0, String arg1) {
    // Introduced an unreachable if statement with a dynamic condition
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      return 42; // This line is unreachable
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
  private static boolean getUnreachableCondition() {
    return false;
  }
}