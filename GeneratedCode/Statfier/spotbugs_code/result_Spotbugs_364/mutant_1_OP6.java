class Bug2845646 {
  public static int compare(String arg0, String arg1) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
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
    return false; // This method ensures the condition is dynamically determined but always false
  }
}