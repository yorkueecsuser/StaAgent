class Bug2910862 {

  public int compare(String arg0, String arg1) {
    // Introducing an unreachable if statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      return 42; // This will never be reached
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
    return false; // This method always returns false, making the condition unreachable
  }
}