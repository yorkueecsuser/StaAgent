class Bug2031441 {

  int foo(int size, int priority) {
    // Original code
    return (int) (size / 2 * Math.pow(0.8, priority));

    // Inserted unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      size = size + 1;
    } else {
      // This block will also never execute because getCondition() always returns false
      priority = priority + 1;
    }
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}