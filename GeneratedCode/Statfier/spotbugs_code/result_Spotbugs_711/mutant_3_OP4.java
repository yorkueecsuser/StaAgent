class Bug1948275 {
  public static String trim(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        return value; // This branch is unreachable because condition is already true
      } else {
        return null; // This branch is also unreachable
      }
    }
    return value == null? value : value.trim(); // should not report
  }

  public static String trim2(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        return value; // This branch is unreachable because condition is already true
      } else {
        return "World"; // This branch is also unreachable
      }
    }
    if (value == null) {
      return value; // should not report
    }
    return "Hello";
  }

  public static String trim3(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        String s = "Hello";
        s += value; // This branch is unreachable because condition is already true
        return s;
      } else {
        return "Unreachable"; // This branch is also unreachable
      }
    }
    if (value == null) {
      String s = "Hello";
      s += value; // should report
      return s;
    }
    return "Hello";
  }

  private static boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined at runtime
  }
}