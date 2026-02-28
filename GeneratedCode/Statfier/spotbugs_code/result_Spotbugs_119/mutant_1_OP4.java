class Ideas_2009_03_16 {

  public static final Long LONG_NULL = null;

  static boolean foo(Long x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable if block.");
      } else {
        System.out.println("This is an unreachable else block.");
      }
    }
    return x == LONG_NULL;
  }

  static boolean foo(long x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable if block.");
      } else {
        System.out.println("This is an unreachable else block.");
      }
    }
    return x == LONG_NULL;
  }

  static boolean foo2(Long x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable if block.");
      } else {
        System.out.println("This is an unreachable else block.");
      }
    }
    return x == null;
  }

  private static boolean getCondition() {
    return true; // This can be any dynamic condition
  }

  private static boolean getFalseCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }
}