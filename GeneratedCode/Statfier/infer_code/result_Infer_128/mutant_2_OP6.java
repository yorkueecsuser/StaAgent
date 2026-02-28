import javax.annotation.Nullable;

/** Nullability checks for captured params */
class CapturedParam {

  void dereferencingNullableIsBAD(@Nullable Object parameter) {
    parameter.toString();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }
  }

  void dereferencingCapturedNullableShouldBeBAD_FIXME(@Nullable Object parameter) {
    Object object =
        new Object() {
          void foo() {
            // Should be disallowed, but it is not the case
            // TODO(T53473076) fix the FN.
            parameter.toString();
            boolean conditionForInner = getCondition();
            for (int i = 0; conditionForInner; i++) {
              // This loop is unreachable because conditionForInner is dynamically determined and will be false
            }
          }
        };
  }

  private boolean getCondition() {
    return false;
  }
}