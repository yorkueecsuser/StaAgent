class Bug1995271 {

  public static int foo(int x, int y) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because conditionWhile is always false
    }
    if (x < 5 || x < 5) throw new IllegalArgumentException("This is wrong");
    return x + y;
  }

  public static int foo2(int x, int y) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because conditionWhile is always false
    }
    if (x < 5 && x < 5) throw new IllegalArgumentException("This is wrong");
    return x + y;
  }

  public static int foo3(int x, int y) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because conditionWhile is always false
    }
    if (x < 5) if (x < 5) throw new IllegalArgumentException("This is wrong");
    return x + y;
  }

  public static boolean foo4(int x, int y) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because conditionWhile is always false
    }
    if (x == 3 || x!= 3 && y == 5) return true;
    return false;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is always false
  }
}