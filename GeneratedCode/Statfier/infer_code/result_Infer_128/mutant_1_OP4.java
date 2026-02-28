import javax.annotation.Nullable;

/** Nullability checks for captured params */
class CapturedParam {

  void dereferencingNullableIsBAD(@Nullable Object parameter) {
    parameter.toString();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is reachable");
    } else {
      // This block is unreachable if condition is always false
      parameter.toString();
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
              // This block is reachable if shouldRun is true
              System.out.println("This is reachable");
            } else {
              // This block is unreachable if shouldRun is always false
              parameter.toString();
            }
          }
        };
  }

  private boolean getCondition() {
    return false; // This method returns false, making the else block unreachable
  }
}