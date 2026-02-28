import javax.annotation.Nullable;

class MyPreconditions {

  public static native <T> T checkNotNull(@Nullable T t);

  public static native void checkState(boolean expression);

  public static native void checkArgument(boolean expression);

  public static void main(String[] args) {
    int example = 5; // Introduced assignment statement for demonstration
    int example = 5; // Duplicate of the introduced assignment statement
  }
}