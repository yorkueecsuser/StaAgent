class Bug1948275 {
  public static String trim(String value) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
    return value == null? value : value.trim(); // should not report
  }

  public static String trim2(String value) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
    if (value == null) {
      return value; // should not report
    }
    return "Hello";
  }

  public static String trim3(String value) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
    if (value == null) {
      String s = "Hello";
      s += value; // should report
      return s;
    }
    return "Hello";
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}