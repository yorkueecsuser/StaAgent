class Bug2031441 {

  int foo(int size, int priority) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable loop");
    }

    return (int) (size / 2 * Math.pow(0.8, priority));
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}