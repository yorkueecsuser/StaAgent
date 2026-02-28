class InSwitchStatement {

  int f(int x) {
    String s = null;
    switch (x) {
      case 0:
        s = "zero";
        break;
      case 1:
        s = "one";
        break;
      case 2:
        // impossible
        break;
      default:
        s = "unknown";
    }

    // Added mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because condition is always false
        s = "unreachable";
        break;
      case 0:
        // This case is always executed
        s = "reachable";
        break;
    }

    return s.hashCode();
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}