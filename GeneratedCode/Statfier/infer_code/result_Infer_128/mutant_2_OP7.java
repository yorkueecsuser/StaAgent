import javax.annotation.Nullable;

/** Nullability checks for captured params */
class CapturedParam {

  void dereferencingNullableIsBAD(@Nullable Object parameter) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    parameter.toString();
  }

  void dereferencingCapturedNullableShouldBeBAD_FIXME(@Nullable Object parameter) {
    Object object =
        new Object() {
          void foo() {
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
              // Unreachable while loop
            }
            // Should be disallowed, but it is not the case
            // TODO(T53473076) fix the FN.
            parameter.toString();
          }
        };
  }

  private boolean getCondition() {
    return false;
  }
}