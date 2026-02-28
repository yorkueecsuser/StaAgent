import javax.annotation.Nullable;

class MyPreconditions {

  public static native <T> T checkNotNull(@Nullable T t);

  public static native void checkState(boolean expression);

  public static native void checkArgument(boolean expression);

  // Added mutant code with an unreachable if statement
  public static void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might run
    }
    // Unreachable if statement
    boolean unreachableCondition = falseCondition();
    if (unreachableCondition) {
      // This block is unreachable
      System.out.println("This will never be printed");
    }
  }

  private static boolean getCondition() {
    // Simulate a dynamic condition
    return true;
  }

  private static boolean falseCondition() {
    // Always returns false, but not a compile-time constant
    return 1 > 2;
  }
}