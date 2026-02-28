class Bug1948275 {
  public static String trim(String value) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return "Unreachable"; // This line is unreachable
    }
    return value == null? value : value.trim(); // should not report
  }

  public static String trim2(String value) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return "Unreachable"; // This line is unreachable
    }
    if (value == null) {
      return value; // should not report
    }
    return "Hello";
  }

  public static String trim3(String value) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return "Unreachable"; // This line is unreachable
    }
    if (value == null) {
      String s = "Hello";
      s += value; // should report
      return s;
    }
    return "Hello";
  }

  private static boolean getCondition() {
    return false; // This method returns false, but it is not a compile-time constant
  }
}