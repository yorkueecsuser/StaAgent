class Ideas_2010_08_03 {

  static int getValue(char c) {
    int x = Character.getNumericValue(c);
    if (x == -2) throw new IllegalArgumentException(c + " is not a nonnegative integer");
    if (x == -2) throw new IllegalArgumentException(c + " does not represent a number");
    return x;
  }

  static boolean isNegative(char c) {
    return c == -1;
  }

  static boolean is255(byte b) {
    return b == 255;
  }

  // Mutated code
  static int getValue(char d) {
    int y = Character.getNumericValue(d);
    if (y == -2) throw new IllegalArgumentException(d + " is not a nonnegative integer");
    if (y == -2) throw new IllegalArgumentException(d + " does not represent a number");
    return y;
  }

  static boolean isNegative(char e) {
    return e == -1;
  }

  static boolean is255(byte a) {
    return a == 255;
  }
}