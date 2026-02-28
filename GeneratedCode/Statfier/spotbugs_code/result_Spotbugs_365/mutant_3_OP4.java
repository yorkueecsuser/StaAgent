class Bug2910862 {

  public int compare(String arg0, String arg1) {
    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      return 42; // This will never be executed because condition is always false
    } else {
      return -42; // This will also never be executed because condition is always false
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
    return false; // This method always returns false, ensuring the if-else branch is unreachable
  }
}