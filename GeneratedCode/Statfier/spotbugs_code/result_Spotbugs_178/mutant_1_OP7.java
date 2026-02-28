class Ideas_2009_10_07 {

  static int f(boolean b1, boolean b2, Object x) {
    if (x == null) {
      System.out.println("x null");
      if (b1) System.out.println("b1 true");
      System.out.println(x);
    }
    if (b1) System.out.println("b1 true");

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      System.out.println("Unreachable loop");
    }

    if (b1) return x.hashCode();
    return -x.hashCode();
  }

  static int f(boolean b1, boolean b2) {
    Object x = null;
    if (b1) System.out.println("b1 true");
    if (b1) {
      x = "a";
    }

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      System.out.println("Unreachable loop");
    }

    if (b1) return x.hashCode();
    return -x.hashCode();
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}