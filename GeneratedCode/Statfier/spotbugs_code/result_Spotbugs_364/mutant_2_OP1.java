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
    String qzjxflrt = "unusedVariable"; // Dead Store mutation
    return arg0.compareToIgnoreCase(arg1);
  }
}