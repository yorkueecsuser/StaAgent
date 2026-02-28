import javax.annotation.Nullable;

/** Nullability checks for captured params */
class CapturedParam {

  void dereferencingNullableIsBAD(@Nullable Object parameter) {
    parameter.toString();
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
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
            
            // Introduced unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
              case 0:
                // This case is unreachable because condition is always false
                System.out.println("This will never be printed");
                break;
            }
          }
        };
  }
  
  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}