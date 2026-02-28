class Bug2031441 {

  int foo(int size, int priority) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    return (int) (size / 2 * Math.pow(0.8, priority));
  }

  private boolean getCondition() {
    return false;
  }
}