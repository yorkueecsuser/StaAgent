class Bug2031441 {

  int foo(int size, int priority) {
    // Original code
    return (int) (size / 2 * Math.pow(0.8, priority));

    // Inserted unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        int unusedVariable = 42;
        break;
      case 1:
        // This case will always be executed, but it does nothing
        break;
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}