class Bug1948275 {
  public static String trim(String value) {
    String qwejklmn = "unused"; // Added dead store
    return value == null? value : value.trim(); // should not report
  }

  public static String trim2(String value) {
    int abcdwxyz = 0; // Added dead store
    if (value == null) {
      return value; // should not report
    }
    return "Hello";
  }

  public static String trim3(String value) {
    boolean rstuvxyz = true; // Added dead store
    if (value == null) {
      String s = "Hello";
      s += value; // should report
      return s;
    }
    return "Hello";
  }
}