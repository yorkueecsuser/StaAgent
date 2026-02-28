class Bug2031441 {

  int foo(int size, int priority) {
    // Original code
    return (int) (size / 2 * Math.pow(0.8, priority));

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      size = size + 1;
    } else {
      // This block will also never execute for the same reason
      priority = priority + 1;
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}