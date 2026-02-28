import javax.annotation.Nullable;

class MyPreconditions {

  public static native <T> T checkNotNull(@Nullable T t);

  public static native void checkState(boolean expression);

  public static native void checkArgument(boolean expression);

  // Hypothetical method to demonstrate duplication mutation
  public static void hypotheticalMethod() {
    int exampleVariable = 10; // Original assignment statement
    int exampleVariable = 10; // Duplicated assignment statement
  }
}