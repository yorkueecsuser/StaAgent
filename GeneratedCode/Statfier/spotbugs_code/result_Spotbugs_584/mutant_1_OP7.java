class InSwitchStatement {

  int f(int x) {
    String s = null;
    boolean conditionWhile = getCondition();
    switch (x) {
      case 0:
        s = "zero";
        while (conditionWhile) {
          // Unreachable while loop
        }
        break;
      case 1:
        s = "one";
        break;
      case 2:
        // impossible
        while (conditionWhile) {
          // Unreachable while loop
        }
        break;
      default:
        s = "unknown";
        while (conditionWhile) {
          // Unreachable while loop
        }
    }
    return s.hashCode();
  }

  private boolean getCondition() {
    return false;
  }
}