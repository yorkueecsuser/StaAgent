class Bug2910862 {

  public int compare(String arg0, String arg1) {
    boolean unreachableCondition = getUnreachableCondition();
    
    if (unreachableCondition) {
      // Unreachable if-else branch
      if (arg0.length() > 10) {
        return -2;
      } else {
        return 2;
      }
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
    // This method always returns false, making the if-else branch unreachable
    return false;
  }
}