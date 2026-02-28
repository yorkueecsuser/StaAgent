class Bug1948275 {
  public static String trim(String value) {
    return value == null? value : value.trim(); // should not report
  }

  public static String trim2(String value) {
    if (value == null) {
      return value; // should not report
    }
    return "Hello";
  }

  public static String trim3(String value) {
    if (value == null) {
      String s = "Hello";
      boolean shouldRun = getCondition();
      if (shouldRun) {
        s += value; // should report
      } else {
        // Unreachable if-else statement
        s += "Unreachable";
      }
      return s;
    }
    return "Hello";
  }

  private static boolean getCondition() {
    // This method should return a dynamically determined value at runtime
    return false; // This is just a placeholder; in a real scenario, this should be dynamic
  }
}