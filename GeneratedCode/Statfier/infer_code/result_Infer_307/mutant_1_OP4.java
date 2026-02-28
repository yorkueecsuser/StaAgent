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
          if (shouldRun) {
            // This is the original code block
            for (int i = 0; i < y; i++) {}
          } else {
            // This is the inserted unreachable if-else branch
            System.out.println("This is an unreachable else block");
          }
        };
    fobj.abstractFun(x);
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return true; // Always returns true to ensure the original code block runs
  }
}