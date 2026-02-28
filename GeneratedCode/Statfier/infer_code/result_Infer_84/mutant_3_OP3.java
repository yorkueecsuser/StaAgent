import javax.annotation.Nullable;

class MyPreconditions {

  public static native <T> T checkNotNull(@Nullable T t);

  public static native void checkState(boolean expression);

  public static native void checkArgument(boolean expression);

  // Added mutant code
  public static void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    }
    // Unreachable if statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable statement");
    }
  }

  private static boolean getCondition() {
    return true; // This can be any dynamic condition
  }

  private static boolean getUnreachableCondition() {
    return false; // This method ensures the condition is false at runtime
  }
}