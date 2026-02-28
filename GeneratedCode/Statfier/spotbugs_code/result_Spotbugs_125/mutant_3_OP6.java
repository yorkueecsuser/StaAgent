class Ideas_2010_08_03 {

  static int getValue(char c) {
    int x = Character.getNumericValue(c);
    if (x == -2) throw new IllegalArgumentException(c + " is not a nonnegative integer");
    if (x == -2) throw new IllegalArgumentException(c + " does not represent a number");

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }

    return x;
  }

  static boolean isNegative(char c) {
    return c == -1;
  }

  static boolean is255(byte b) {
    return b == 255;
  }

  // Method to provide a dynamic condition for the unreachable for loop
  private static boolean getCondition() {
    return false;
  }
}