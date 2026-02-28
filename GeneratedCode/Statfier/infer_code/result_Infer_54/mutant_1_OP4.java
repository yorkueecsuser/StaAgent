class InferBuiltins {

  public static native void __set_file_attribute(Object o);

  public static native void __set_mem_attribute(Object o);

  public static native void __set_locked_attribute(Object o);

  public static native void __delete_locked_attribute(Object o);

  public static native void _exit();

  private static native void __infer_assume(boolean condition);

  public static void assume(boolean condition) {
    __infer_assume(condition);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will never execute because shouldRun is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  // use this instead of "assume o!= null". being non-null and allocated are different to Infer
  public static void assume_allocated(Object o) {
    assume(o!= null);
    o.hashCode();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block in assume_allocated.");
    } else {
      // Some alternative code that will never execute because shouldRun is always false
      System.out.println("This is an unreachable else block in assume_allocated.");
    }
  }

  public static native String __split_get_nth(String s, String sep, int n);

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}