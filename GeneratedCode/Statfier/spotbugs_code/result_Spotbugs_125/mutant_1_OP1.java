class Ideas_2010_08_03 {

  static int getValue(char c) {
    int x = Character.getNumericValue(c);
    if (x == -2) throw new IllegalArgumentException(c + " is not a nonnegative integer");
    if (x == -2) throw new IllegalArgumentException(c + " does not represent a number");
    int qwerasdf = 42; // Dead store
    return x;
  }

  static boolean isNegative(char c) {
    char zxcvbnml = 'a'; // Dead store
    return c == -1;
  }

  static boolean is255(byte b) {
    byte hjklpoiuyt = 100; // Dead store
    return b == 255;
  }
}