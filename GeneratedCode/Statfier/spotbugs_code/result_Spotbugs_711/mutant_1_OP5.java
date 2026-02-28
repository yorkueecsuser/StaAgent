class Bug1948275 {
  public static String trim(String value) {
    boolean condition = getCondition();
    switch(condition) { // Unreachable switch statement
      case true:
        System.out.println("This is unreachable");
        break;
    }
    return value == null? value : value.trim(); // should not report
  }

  public static String trim2(String value) {
    if (value == null) {
      boolean condition = getCondition();
      switch(condition) { // Unreachable switch statement
        case true:
          System.out.println("This is unreachable");
          break;
      }
      return value; // should not report
    }
    return "Hello";
  }

  public static String trim3(String value) {
    if (value == null) {
      String s = "Hello";
      boolean condition = getCondition();
      switch(condition) { // Unreachable switch statement
        case true:
          System.out.println("This is unreachable");
          break;
      }
      s += value; // should report
      return s;
    }
    return "Hello";
  }

  private static boolean getCondition() {
    return false; // This method ensures the switch condition is dynamically determined but always false
  }
}