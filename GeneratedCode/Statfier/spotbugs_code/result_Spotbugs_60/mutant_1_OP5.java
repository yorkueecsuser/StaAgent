class Bug2031441 {

  int foo(int size, int priority) {
    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition? 1 : 0) {
      case 1:
        // This case is unreachable because getUnreachableCondition() always returns false
        size = size + 1;
        break;
      case 0:
        // This is the only reachable case
        break;
    }
    return (int) (size / 2 * Math.pow(0.8, priority));
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, ensuring the switch statement is mostly unreachable
    return false;
  }
}