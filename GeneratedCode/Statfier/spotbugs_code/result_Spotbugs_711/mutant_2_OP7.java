class Bug1948275 {
  public static String trim(String value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return value == null? value : value.trim(); // should not report
  }

  public static String trim2(String value) {
    if (value == null) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return value; // should not report
    }
    return "Hello";
  }

  public static String trim3(String value) {
    if (value == null) {
      String s = "Hello";
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      s += value; // should report
      return s;
    }
    return "Hello";
  }

  private static boolean getCondition() {
    return false;
  }
}