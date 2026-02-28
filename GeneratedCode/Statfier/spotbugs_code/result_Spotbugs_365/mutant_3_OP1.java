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
    // Dead Store Mutation
    String yqjvfnxw = "unusedVariable";
    return arg0.compareToIgnoreCase(arg1);
  }
}