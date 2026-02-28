class Bug2910862 {

  public int compare(String arg0, String arg1) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is dynamically determined and will never be true in this context.
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
    // This method ensures that the condition is dynamically determined and will never be true.
    return false;
  }
}