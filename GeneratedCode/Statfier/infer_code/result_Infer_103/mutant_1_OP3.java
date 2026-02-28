/**
 * WARNING! These methods are for testing the taint analysis only! Don't use them in models or in
 * real code.
 */
class InferTaint {

  // these are to test whether we can add a taint spec to methods that have an implementation
  public static Object inferSecretSource() {
    Object o = InferUndefined.object_undefined();
    InferBuiltins.assume_allocated(o);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return o;
  }

  public static void inferSensitiveSink(Object iMightBeTainted) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is another unreachable statement");
    }
  }

  // these are to test whether we can add a taint spec to undefined methods
  public static native Object inferSecretSourceUndefined();

  public static native void inferSensitiveSinkUndefined(Object iMightBeTainted);

  private static boolean getCondition() {
    // This method always returns false, making the if statements effectively unreachable
    return false;
  }
}