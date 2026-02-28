import javax.annotation.Nullable;

/** Nullability checks for captured params */
class CapturedParam {

  void dereferencingNullableIsBAD(@Nullable Object parameter) {
    parameter.toString();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
  }

  void dereferencingCapturedNullableShouldBeBAD_FIXME(@Nullable Object parameter) {
    Object object =
        new Object() {
          void foo() {
            // Should be disallowed, but it is not the case
            // TODO(T53473076) fix the FN.
            parameter.toString();
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // Some unreachable code
              System.out.println("This is unreachable inside anonymous class");
            } else {
              // Another unreachable code
              System.out.println("This is also unreachable inside anonymous class");
            }
          }
        };
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the branches are unreachable
  }
}