class Bug2845646 {
  public static int compare(String arg0, String arg1) {
    // Introducing an unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable because getUnreachableCondition() always returns false
      return -999;
    } else {
      // This block is also unreachable because the if condition is always false
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

  private static boolean getUnreachableCondition() {
    // This method always returns false, making the if-else block unreachable
    return false;
  }
}