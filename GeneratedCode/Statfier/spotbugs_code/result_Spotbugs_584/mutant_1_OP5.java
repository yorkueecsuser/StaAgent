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

    // Mutant: Unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse? 1 : 0) {
      case 1:
        // This case is unreachable because alwaysFalse is always false
        s = "unreachable";
        break;
      case 0:
        // This case is always taken
        s = "reachable";
        break;
    }

    return s.hashCode();
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}