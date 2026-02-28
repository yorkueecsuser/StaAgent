class Ideas_2009_03_16 {

  public static final Long LONG_NULL = null;

  static boolean foo(Long x) {
    return x == LONG_NULL;
  }

  static boolean foo(long y) {
    return y == LONG_NULL;
  }

  static boolean foo2(Long z) {
    return z == null;
  }
}