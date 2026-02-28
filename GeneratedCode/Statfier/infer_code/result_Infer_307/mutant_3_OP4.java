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
          boolean shouldRun = getCondition();
          for (int i = 0; i < y; i++) {
            if (shouldRun) {
              // Some code that should run if shouldRun is true
            } else {
              // Unreachable if-else branch
              System.out.println("This is an unreachable else block");
            }
          }
        };
    fobj.abstractFun(x);
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the else block is unreachable
    return false;
  }
}