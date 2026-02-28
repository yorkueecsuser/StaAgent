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

    // Added mutant code with an unreachable switch statement
    boolean condition = getCondition();
    switch (getValue()) {
      case 1:
        if (condition) {
          s = "unreachable";
        }
        break;
      case 2:
        if (condition) {
          s = "still unreachable";
        }
        break;
      default:
        if (condition) {
          s = "definitely unreachable";
        }
    }

    return s.hashCode();
  }

  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the switch unreachable
  }

  private int getValue() {
    return 0; // This ensures the switch expression never matches any case
  }
}