class Bug2031441 {

  int foo(int size, int priority) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        int unreachableVar = 42;
        break;
      case 1:
        // This is the only reachable case
        break;
    }
    return (int) (size / 2 * Math.pow(0.8, priority));
  }

  private boolean getCondition() {
    // This method always returns false, making the switch case 0 unreachable
    return false;
  }
}