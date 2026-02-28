import javax.annotation.Nullable;

class MyPreconditions {

  public static native <T> T checkNotNull(@Nullable T t);

  public static native void checkState(boolean expression);

  public static native void checkArgument(boolean expression);

  // Mutated code with renamed variable
  public static native <T> T checkNotNull(@Nullable T x);

  public static native void checkState(boolean expr);

  public static native void checkArgument(boolean arg);
}