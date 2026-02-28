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

          // Inserted unreachable for loop
          boolean conditionFor = getCondition();
          for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
          }
        };
    fobj.abstractFun(x);
  }

  private boolean getCondition() {
    return false;
  }
}