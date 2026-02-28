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
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block is intended to be unreachable
          s = "unreachable";
        } else {
          // Alternative block
          s = "still unreachable";
        }
        break;
      default:
        s = "unknown";
    }
    return s.hashCode();
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if-else block unreachable
  }
}