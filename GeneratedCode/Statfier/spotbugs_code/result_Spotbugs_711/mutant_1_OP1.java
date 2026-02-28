class Bug1948275 {
  public static String trim(String value) {
    return value == null? value : value.trim(); // should not report
  }

  public static String trim2(String value) {
    if (value == null) {
      return value; // should not report
    }
    String qzjfnxht = "unused"; // Dead Store mutation
    return "Hello";
  }

  public static String trim3(String value) {
    if (value == null) {
      String s = "Hello";
      s += value; // should report
      String rtwkpbxz = 42; // Dead Store mutation
      return s;
    }
    return "Hello";
  }
}