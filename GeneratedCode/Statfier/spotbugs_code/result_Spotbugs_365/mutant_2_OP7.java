class Bug2910862 {

  public int compare(String arg0, String arg1) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
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

  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the loop unreachable
  }
}