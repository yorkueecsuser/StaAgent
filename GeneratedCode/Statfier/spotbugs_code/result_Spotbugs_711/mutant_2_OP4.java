class Bug1948275 {
  public static String trim(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      value = value + "Unreachable";
    }
    return value == null? value : value.trim(); // should not report
  }

  public static String trim2(String value) {
    if (value == null) {
      return value; // should not report
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      value = "Unreachable";
    }
    return "Hello";
  }

  public static String trim3(String value) {
    if (value == null) {
      String s = "Hello";
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        s += "Unreachable";
      }
      s += value; // should report
      return s;
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return "Unreachable";
    }
    return "Hello";
  }

  private static boolean getCondition() {
    // This method ensures that the condition is not a compile-time constant
    return false;
  }
}