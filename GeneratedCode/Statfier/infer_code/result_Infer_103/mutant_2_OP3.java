/**
 * WARNING! These methods are for testing the taint analysis only! Don't use them in models or in
 * real code.
 */
class InferTaint {

  // these are to test whether we can add a taint spec to methods that have an implementation
  public static Object inferSecretSource() {
    Object o = InferUndefined.object_undefined();
    InferBuiltins.assume_allocated(o);
    return o;
  }

  public static void inferSensitiveSink(Object iMightBeTainted) {
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to represent an unreachable if statement
    }
  }

  // these are to test whether we can add a taint spec to undefined methods
  public static native Object inferSecretSourceUndefined();

  public static native void inferSensitiveSinkUndefined(Object iMightBeTainted);

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will always return false, but the condition is dynamically determined
  }
}