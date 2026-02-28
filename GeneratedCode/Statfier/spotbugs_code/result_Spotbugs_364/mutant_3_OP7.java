class Bug2845646 {
  public static int compare(String arg0, String arg1) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is dynamically determined and set to false
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

  private static boolean getCondition() {
    return false;
  }
}