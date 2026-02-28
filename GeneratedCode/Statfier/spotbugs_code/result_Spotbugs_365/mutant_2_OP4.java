class Bug2910862 {

  public int compare(String arg0, String arg1) {
    if (null == arg0 && null!= arg1) {
      return -1;
    }
    if (null!= arg0 && null == arg1) {
      return 1;
    }
    if (null == arg0 && null == arg1) {
      return 0;
    }
    
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is unreachable because getCondition() will always return false
      return 42;
    } else {
      // This block is also unreachable for the same reason
      return -42;
    }

    return arg0.compareToIgnoreCase(arg1);
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else block unreachable
    return false;
  }
}