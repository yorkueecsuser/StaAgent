class Ideas_2009_03_14 {

  int foo(int x) {
    String tmp = null;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    switch (x) {
      case 0:
        tmp = "zero";
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
    return false;
  }
}