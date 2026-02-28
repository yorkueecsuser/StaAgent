class Bug2031441 {

  int foo(int size, int priority) {
    boolean condition = getSizeCondition(size);
    if (condition) {
      // This block is unreachable because getSizeCondition will always return false
      size = size + 1;
    }
    return (int) (size / 2 * Math.pow(0.8, priority));
  }

  private boolean getSizeCondition(int size) {
    // Always returns false, making the if block unreachable
    return false;
  }
}