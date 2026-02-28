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
    return arg0.compareToIgnoreCase(arg1);
  }

  // Mutated code with renaming operator
  public static int compare(String b, String c) {
    if (null == b && null!= c) {
      return -1;
    }
    if (null!= b && null == c) {
      return 1;
    }
    if (null == b && null == c) {
      return 0;
    }
    return b.compareToIgnoreCase(c);
  }
}