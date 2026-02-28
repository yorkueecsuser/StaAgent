class Ideas_2009_03_14 {

  int foo(int x) {
    String tmp = null;
    boolean conditionWhile = getCondition();
    switch (x) {
      case 0:
        tmp = "zero";
        // Unreachable while loop
        while (conditionWhile) {
          // This loop will never execute because conditionWhile is dynamically determined and not set to true
        }
        break;
      case 1:
        tmp = "one";
        break;
      case 2:
        tmp = "two";
        break;
    }
    return tmp.hashCode();
  }

  private boolean getCondition() {
    // This method returns false, making the while loop unreachable
    return false;
  }
}