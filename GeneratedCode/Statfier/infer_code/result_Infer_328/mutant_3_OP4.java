class FieldAccess {

  class Test {
    int a;
  }

  void iterate_upto_field_size_linear(Test test) {
    for (int ci = 0; ci < test.a; ++ci) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
      } else {
        // Alternative code that also never executes
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}