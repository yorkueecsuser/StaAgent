class Bug2031441 {

  int foo(int size, int priority) {
    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      size = size + 1;
    }

    return (int) (size / 2 * Math.pow(0.8, priority));
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}