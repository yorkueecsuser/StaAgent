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
        boolean condition = getCondition();
        if (condition) {
          // This is an unreachable if statement
          s = "unreachable";
        }
        break;
      default:
        s = "unknown";
    }
    return s.hashCode();
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}