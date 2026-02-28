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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // unreachable loop body
        }
        break;
      default:
        s = "unknown";
    }
    return s.hashCode();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}