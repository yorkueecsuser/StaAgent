class Ideas_2009_03_16 {

  public static final Long LONG_NULL = null;
  public static final Long LONG_NULL = null; // Duplicate of the original assignment

  static boolean foo(Long x) {
    return x == LONG_NULL;
    return x == LONG_NULL; // Duplicate of the original return statement
  }

  static boolean foo(long x) {
    return x == LONG_NULL;
    return x == LONG_NULL; // Duplicate of the original return statement
  }

  static boolean foo2(Long x) {
    return x == null;
    return x == null; // Duplicate of the original return statement
  }
}