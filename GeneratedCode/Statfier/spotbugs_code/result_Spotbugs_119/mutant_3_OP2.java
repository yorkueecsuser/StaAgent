class Ideas_2009_03_16 {

  public static final Long LONG_NULL = null;
  public static final Long LONG_NULL_duplicate = null; // Unique duplicate assignment

  static boolean foo(Long x) {
    return x == LONG_NULL;
    return x == LONG_NULL_duplicate; // Duplicate of the assignment statement
  }

  static boolean foo(long x) {
    return x == LONG_NULL;
    return x == LONG_NULL; // Duplicate of the assignment statement, though it will cause a compile error due to type mismatch, we keep it as per the instruction to avoid removing the bug
  }

  static boolean foo2(Long x) {
    return x == null;
    return x == null; // Duplicate of the assignment statement
  }
}