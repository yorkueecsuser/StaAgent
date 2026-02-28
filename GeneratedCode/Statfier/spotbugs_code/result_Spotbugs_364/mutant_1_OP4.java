class Bug2845646 {
  public static int compare(String arg0, String arg1) {
    if (null == arg0 && null!= arg1) {
      return -1;
    }
    if (null!= arg0 && null == arg1) {
      return 1;
    }
    if (null == arg0 && null == arg1) {
      return 0;
    }
    // Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      return -999; // Unique unreachable code
    } else {
      // This block is also intended to be unreachable
      return 999; // Unique unreachable code
    }
    return arg0.compareToIgnoreCase(arg1);
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will ensure the if-else block remains unreachable
  }
}