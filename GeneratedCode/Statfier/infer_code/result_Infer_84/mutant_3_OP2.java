import javax.annotation.Nullable;

class MyPreconditions {

  public static native <T> T checkNotNull(@Nullable T t);

  public static native void checkState(boolean expression);

  public static native void checkArgument(boolean expression);

  public static void someMethod() {
    int x = 5; // Hypothetical assignment statement
    int x = 5; // Duplicate of the hypothetical assignment statement
  }
}