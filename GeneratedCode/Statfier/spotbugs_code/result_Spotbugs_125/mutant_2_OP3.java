class Ideas_2010_08_03 {

  static int getValue(char c) {
    int x = Character.getNumericValue(c);
    if (x == -2) throw new IllegalArgumentException(c + " is not a nonnegative integer");
    if (x == -2) throw new IllegalArgumentException(c + " does not represent a number");

    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never true
      System.out.println("This is an unreachable statement");
    }

    return x;
  }

  static boolean isNegative(char c) {
    return c == -1;
  }

  static boolean is255(byte b) {
    return b == 255;
  }

  // Helper method to ensure the condition is dynamically determined at runtime
  private static boolean getCondition() {
    return false;
  }
}