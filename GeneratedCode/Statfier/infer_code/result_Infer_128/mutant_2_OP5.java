import javax.annotation.Nullable;

/** Nullability checks for captured params */
class CapturedParam {

  void dereferencingNullableIsBAD(@Nullable Object parameter) {
    parameter.toString();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable switch case");
        break;
    }
  }

  void dereferencingCapturedNullableShouldBeBAD_FIXME(@Nullable Object parameter) {
    Object object =
        new Object() {
          void foo() {
            // Should be disallowed, but it is not the case
            // TODO(T53473076) fix the FN.
            parameter.toString();
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
              case 0:
                // This case is unreachable because condition is never true
                System.out.println("This is another unreachable switch case");
                break;
            }
          }
        };
  }

  private boolean getCondition() {
    return false;
  }
}