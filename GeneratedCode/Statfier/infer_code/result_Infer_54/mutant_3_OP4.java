class InferBuiltins {

  public static native void __set_file_attribute(Object o);

  public static native void __set_mem_attribute(Object o);

  public static native void __set_locked_attribute(Object o);

  public static native void __delete_locked_attribute(Object o);

  public static native void _exit();

  private static native void __infer_assume(boolean condition);

  public static void assume(boolean condition) {
    __infer_assume(condition);
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This is the reachable block");
    }
  }

  // use this instead of "assume o!= null". being non-null and allocated are different to Infer
  public static void assume_allocated(Object o) {
    assume(o!= null);
    o.hashCode();
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is another unreachable block");
    } else {
      // This block will always execute
      System.out.println("This is another reachable block");
    }
  }

  public static native String __split_get_nth(String s, String sep, int n);

  // Helper method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}