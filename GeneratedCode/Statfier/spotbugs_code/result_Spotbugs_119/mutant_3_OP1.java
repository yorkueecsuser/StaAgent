class Ideas_2009_03_16 {

  public static final Long LONG_NULL = null;

  static boolean foo(Long x) {
    String qzjxvbtl; // Dead store
    return x == LONG_NULL;
  }

  static boolean foo(long x) {
    int mnpqrstu; // Dead store
    return x == LONG_NULL;
  }

  static boolean foo2(Long x) {
    double abcdefgh; // Dead store
    return x == null;
  }
}