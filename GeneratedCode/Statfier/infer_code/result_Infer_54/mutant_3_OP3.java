class InferBuiltins {

  public static native void __set_file_attribute(Object o);

  public static native void __set_mem_attribute(Object o);

  public static native void __set_locked_attribute(Object o);

  public static native void __delete_locked_attribute(Object o);

  public static native void _exit();

  private static native void __infer_assume(boolean condition);

  public static void assume(boolean condition) {
    __infer_assume(condition);
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
  }

  // use this instead of "assume o!= null". being non-null and allocated are different to Infer
  public static void assume_allocated(Object o) {
    assume(o!= null);
    o.hashCode();
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is another unreachable statement.");
    }
  }

  public static native String __split_get_nth(String s, String sep, int n);

  private static boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if condition unreachable
  }
}