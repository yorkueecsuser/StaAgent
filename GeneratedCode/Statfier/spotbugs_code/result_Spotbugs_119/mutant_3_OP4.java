class Ideas_2009_03_16 {

  public static final Long LONG_NULL = null;

  static boolean foo(Long x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in foo(Long x)");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in foo(Long x)");
    }
    return x == LONG_NULL;
  }

  static boolean foo(long x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in foo(long x)");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in foo(long x)");
    }
    return x == LONG_NULL;
  }

  static boolean foo2(Long x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in foo2(Long x)");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in foo2(Long x)");
    }
    return x == null;
  }

  private static boolean getCondition() {
    // This method always returns false, making the if-else branches unreachable
    return false;
  }
}