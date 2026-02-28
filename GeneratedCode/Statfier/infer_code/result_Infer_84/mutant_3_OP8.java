import javax.annotation.Nullable;

class MyPreconditions {

  public static native <T> T checkNotNull(@Nullable T t);

  public static native void checkState(boolean expression);

  public static native void checkArgument(boolean expression);

  // Mutated code
  public static native <T> T checkNotNull(@Nullable T x);

  public static native void checkState(boolean y);

  public static native void checkArgument(boolean z);
}