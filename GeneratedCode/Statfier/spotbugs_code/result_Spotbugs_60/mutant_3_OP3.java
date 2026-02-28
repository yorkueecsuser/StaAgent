class Bug2031441 {

  int foo(int size, int priority) {
    // Original code
    return (int) (size / 2 * Math.pow(0.8, priority));

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      size = size + 1;
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}