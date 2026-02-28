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

          // Inserting unreachable switch statement
          boolean condition = getCondition();
          switch (condition? 0 : 1) {
            case 0:
              // This case is unreachable because condition is always false
              System.out.println("This will never be printed");
              break;
            default:
              // Default case to ensure the switch is not empty
              break;
          }
        };
    fobj.abstractFun(x);
  }

  private boolean getCondition() {
    // This method always returns false, making the switch condition always false
    return false;
  }
}