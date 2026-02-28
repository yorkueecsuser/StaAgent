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
    // Introducing an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case to ensure switch is not empty
        break;
    }
  }

  // these are to test whether we can add a taint spec to undefined methods
  public static native Object inferSecretSourceUndefined();

  public static native void inferSensitiveSinkUndefined(Object iMightBeTainted);

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}