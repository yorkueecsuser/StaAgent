interface LambdaTestI {
  void abstractFun(int x);
}

class LambdaTest {
  void call_lambda_FN(int x) {
    /* Three methods are auto-generated here:
    - LambdaTest.callsite_LambdaTest$Lambda$_2_0
    - LambdaTest.access_LambdaTest$Lambda$_2_0
    - LambdaTest$Lambda$_2_0.<init>
    and one method is newly defined here:
    - LambdaTest$Lambda$_2_0.abstractFun */
    LambdaTestI fobj =
        (int y) -> {
          /* One method is auto-generated here:
          - lambda$call_lambda$0 */
          for (int i = 0; i < y; i++) {}

          // Inserting an unreachable while loop
          boolean conditionWhile = getUnreachableCondition();
          while (conditionWhile) {
            // This loop is unreachable
          }
        };
    fobj.abstractFun(x);
  }

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}