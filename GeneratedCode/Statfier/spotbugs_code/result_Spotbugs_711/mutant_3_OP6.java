class Bug1948275 {
  public static String trim(String value) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is never set to true
    }
    return value == null? value : value.trim(); // should not report
  }

  public static String trim2(String value) {
    if (value == null) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is never set to true
      }
      return value; // should not report
    }
    return "Hello";
  }

  public static String trim3(String value) {
    if (value == null) {
      String s = "Hello";
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is never set to true
      }
      s += value; // should report
      return s;
    }
    return "Hello";
  }

  private static boolean getCondition() {
    return false; // This method returns false, ensuring the loops are unreachable
  }
}