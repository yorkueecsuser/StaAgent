import javax.annotation.Nullable;

class MyPreconditions {

  public static native <T> T checkNotNull(@Nullable T t);

  public static native void checkState(boolean expression);

  public static native void checkArgument(boolean expression);

  // Added mutant code
  public static void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch.");
    }
  }

  private static boolean getCondition() {
    return true; // This ensures the condition is dynamically determined at runtime
  }
}