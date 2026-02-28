import javax.annotation.Nullable;

class MyPreconditions {

  public static native <T> T checkNotNull(@Nullable T t);

  public static native void checkState(boolean expression);

  public static native void checkArgument(boolean expression);

  // Inserting an unreachable if-else statement
  public static void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code here
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block");
    }
  }

  private static boolean getCondition() {
    return true; // This ensures the condition is always true, making the else block unreachable
  }
}