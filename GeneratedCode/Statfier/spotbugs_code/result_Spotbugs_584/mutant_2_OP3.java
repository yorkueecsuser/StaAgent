class InSwitchStatement {

  int f(int x) {
    String s = null;
    boolean condition = getCondition(); // Non-final variable to avoid unreachable statement error

    switch (x) {
      case 0:
        s = "zero";
        break;
      case 1:
        s = "one";
        break;
      case 2:
        // impossible
        if (condition) { // Unreachable if statement
          s = "unreachable";
        }
        break;
      default:
        s = "unknown";
    }
    return s.hashCode();
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statement is unreachable
  }
}