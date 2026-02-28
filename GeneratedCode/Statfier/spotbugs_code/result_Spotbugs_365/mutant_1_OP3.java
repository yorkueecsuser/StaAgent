class Bug2910862 {

  public int compare(String arg0, String arg1) {
    // Introduced an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
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

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}