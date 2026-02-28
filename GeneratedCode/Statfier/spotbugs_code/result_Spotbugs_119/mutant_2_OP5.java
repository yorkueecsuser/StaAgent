class Ideas_2009_03_16 {

  public static final Long LONG_NULL = null;

  static boolean foo(Long x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return x == LONG_NULL;
  }

  static boolean foo(long x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return x == LONG_NULL;
  }

  static boolean foo2(Long x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return x == null;
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch case unreachable
    return false;
  }
}