class Bug2845646 {
  public static int compare(String arg0, String arg1) {
    // Inserting an unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable
      return -999;
    } else {
      // This block is also unreachable
      return 999;
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

  // Method to provide a dynamically determined condition
  private static boolean getUnreachableCondition() {
    return false; // This will always return false, but it's not a compile-time constant in the context of the if-else statement
  }
}