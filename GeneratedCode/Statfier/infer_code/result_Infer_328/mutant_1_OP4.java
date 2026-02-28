class FieldAccess {

  class Test {
    int a;
  }

  void iterate_upto_field_size_linear(Test test) {
    for (int ci = 0; ci < test.a; ++ci) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never execute because shouldRun is always false
        System.out.println("This will never print");
      } else {
        // Alternative code that will also never execute due to the same reason
        System.out.println("This will also never print");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}