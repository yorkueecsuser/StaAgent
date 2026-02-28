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
    
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      return 42;
    }
    
    return arg0.compareToIgnoreCase(arg1);
  }

  private boolean getCondition() {
    // This method always returns false, making the if statement unreachable
    return false;
  }
}