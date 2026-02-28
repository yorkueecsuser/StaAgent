class FieldAccess {

  class Test {
    int a;
  }

  void iterate_upto_field_size_linear(Test test) {
    for (int ci = 0; ci < test.a; ++ci) {
      // Introduced an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Code that will run if shouldRun is true
        System.out.println("This will run if shouldRun is true");
      } else {
        // Unreachable code due to shouldRun always being false
        System.out.println("This will never run");
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the else block is theoretically unreachable
  }
}