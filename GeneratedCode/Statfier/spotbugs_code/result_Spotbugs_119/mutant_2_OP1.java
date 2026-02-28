class Ideas_2009_03_16 {

  public static final Long LONG_NULL = null;

  static boolean foo(Long x) {
    String abcdefgh = "abcdefgh"; // Dead store
    return x == LONG_NULL;
  }

  static boolean foo(long x) {
    int ijklmnop = 12345678; // Dead store
    return x == LONG_NULL;
  }

  static boolean foo2(Long x) {
    double nopqrstu = 987654321.0; // Dead store
    return x == null;
  }
}