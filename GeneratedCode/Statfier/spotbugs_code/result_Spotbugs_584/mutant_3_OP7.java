class InSwitchStatement {

  int f(int x) {
    String s = null;
    boolean conditionWhile = getCondition();
    switch (x) {
      case 0:
        s = "zero";
        while (conditionWhile) {
          // unreachable code
        }
        break;
      case 1:
        s = "one";
        break;
      case 2:
        // impossible
        while (conditionWhile) {
          // unreachable code
        }
        break;
      default:
        s = "unknown";
    }
    return s.hashCode();
  }

  private boolean getCondition() {
    return false;
  }
}