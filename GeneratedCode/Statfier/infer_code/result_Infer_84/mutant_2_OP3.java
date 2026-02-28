import javax.annotation.Nullable;

class MyPreconditions {

  public static native <T> T checkNotNull(@Nullable T t);

  public static native void checkState(boolean expression);

  public static native void checkArgument(boolean expression);

  // Added mutant code with an unreachable if statement
  public static void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    }
    // Unreachable if statement
    boolean unreachableCondition = isUnreachable();
    if (unreachableCondition) {
      // This block is unreachable
      System.out.println("This will never be printed");
    }
  }

  private static boolean getCondition() {
    return true; // Example condition logic
  }

  private static boolean isUnreachable() {
    return false; // This method ensures the condition is always false at runtime
  }
}