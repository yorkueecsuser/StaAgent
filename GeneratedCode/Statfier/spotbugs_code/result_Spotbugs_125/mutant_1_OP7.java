class Ideas_2010_08_03 {

  static int getValue(char c) {
    int x = Character.getNumericValue(c);
    if (x == -2) throw new IllegalArgumentException(c + " is not a nonnegative integer");
    if (x == -2) throw new IllegalArgumentException(c + " does not represent a number");

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }

    return x;
  }

  static boolean isNegative(char c) {
    return c == -1;

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  static boolean is255(byte b) {
    return b == 255;

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}