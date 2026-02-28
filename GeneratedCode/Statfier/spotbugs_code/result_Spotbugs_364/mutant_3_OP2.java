class Bug2845646 {
  public static int compare(String arg0, String arg1) {
    if (null == arg0 && null!= arg1) {
      return -1;
      return -1; // Mutant: Duplicate of the return statement
    }
    if (null!= arg0 && null == arg1) {
      return 1;
      return 1; // Mutant: Duplicate of the return statement
    }
    if (null == arg0 && null == arg1) {
      return 0;
      return 0; // Mutant: Duplicate of the return statement
    }
    return arg0.compareToIgnoreCase(arg1);
  }
}