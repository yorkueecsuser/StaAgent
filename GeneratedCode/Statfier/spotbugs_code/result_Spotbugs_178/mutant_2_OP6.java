class Ideas_2009_10_07 {

  static int f(boolean b1, boolean b2, Object x) {
    if (x == null) {
      System.out.println("x null");
      if (b1) System.out.println("b1 true");
      System.out.println(x);
    }
    if (b1) System.out.println("b1 true");

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
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

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }

    if (b1) return x.hashCode();
    return -x.hashCode();
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}