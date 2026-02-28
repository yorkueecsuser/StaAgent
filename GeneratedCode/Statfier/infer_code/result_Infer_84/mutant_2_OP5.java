import javax.annotation.Nullable;

class MyPreconditions {

  public static native <T> T checkNotNull(@Nullable T t);

  public static native void checkState(boolean expression);

  public static native void checkArgument(boolean expression);

  // Added mutant code
  public static void someMethod() {
    boolean condition = getCondition();
    switch (getValue()) {
      case 1:
        // Some code
        break;
      case 2:
        // Some other code
        break;
      default:
        // Default case
        break;
    }

    // Unreachable switch statement
    int unreachableValue = 0; // This will always be 0, making the switch statement unreachable
    switch (unreachableValue) {
      case 3:
        // This case is unreachable
        System.out.println("This will never be printed");
        break;
      case 4:
        // This case is also unreachable
        System.out.println("This will never be printed either");
        break;
      default:
        // Default case is unreachable
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  private static boolean getCondition() {
    return false; // This method can return any dynamic condition
  }

  private static int getValue() {
    return 1; // This method can return any dynamic value
  }
}