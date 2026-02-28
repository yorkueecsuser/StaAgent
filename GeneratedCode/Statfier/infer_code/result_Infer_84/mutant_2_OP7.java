import javax.annotation.Nullable;

class MyPreconditions {

  public static native <T> T checkNotNull(@Nullable T t);

  public static native void checkState(boolean expression);

  public static native void checkArgument(boolean expression);

  // Introduced an unreachable while loop in the class
  private static boolean getCondition() {
    return false;
  }

  static {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }
}