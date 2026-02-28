class ExclusiveTest {

  void linear(int x) {
    for (int i = 0; i < x; i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Alternative code that will also never run because shouldRun is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  void call_linear_exclusive_constant(int x) {
    linear(x);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Alternative code that will also never run because shouldRun is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  void call_linear_exclusive_linear(int x) {
    for (int i = 0; i < x; i++) {
      linear(i);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Alternative code that will also never run because shouldRun is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}