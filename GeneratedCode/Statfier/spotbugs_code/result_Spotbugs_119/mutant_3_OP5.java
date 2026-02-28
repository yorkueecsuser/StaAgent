class Ideas_2009_03_16 {

  public static final Long LONG_NULL = null;

  static boolean foo(Long x) {
    return x == LONG_NULL;
  }

  static boolean foo(long x) {
    return x == LONG_NULL;
  }

  static boolean foo2(Long x) {
    return x == null;
  }

  // Introduced an unreachable switch statement
  static boolean getCondition() {
    return false;
  }

  static void introduceUnreachableSwitch() {
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }
}