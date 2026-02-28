class InferBuiltins {

  public static native void __set_file_attribute(Object o);

  public static native void __set_mem_attribute(Object o);

  public static native void __set_locked_attribute(Object o);

  public static native void __delete_locked_attribute(Object o);

  public static native void _exit();

  private static native void __infer_assume(boolean condition);

  public static void assume(boolean condition) {
    __infer_assume(condition);
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  // use this instead of "assume o!= null". being non-null and allocated are different to Infer
  public static void assume_allocated(Object o) {
    assume(o!= null);
    o.hashCode();
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  public static native String __split_get_nth(String s, String sep, int n);

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}