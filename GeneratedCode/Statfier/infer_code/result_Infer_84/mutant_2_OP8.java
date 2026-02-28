import javax.annotation.Nullable;

class MyPreconditions {

  public static native <T> T checkNotNull(@Nullable T t);

  public static native void checkState(boolean expression);

  public static native void checkArgument(boolean expression);

  // Mutated code
  public static native <T> T checkNotNull(@Nullable T a);

  public static native void checkState(boolean b);

  public static native void checkArgument(boolean c);
}