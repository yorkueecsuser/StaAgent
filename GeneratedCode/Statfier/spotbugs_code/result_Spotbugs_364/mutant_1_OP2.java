class Bug2845646 {
  public static int compare(String arg0, String arg1) {
    if (null == arg0 && null!= arg1) {
      return -1;
    }
    if (null!= arg0 && null == arg1) {
      return 1;
    }
    if (null == arg0 && null == arg1) {
      return 0;
    }
    int result = arg0.compareToIgnoreCase(arg1);
    int resultCopy = result; // Duplicate assignment statement
    return result;
  }
}