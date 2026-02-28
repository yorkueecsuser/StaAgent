class InSwitchStatement {

  int f(int x) {
    String s = null;
    boolean unreachableCondition = getUnreachableCondition();
    
    switch (x) {
      case 0:
        s = "zero";
        break;
      case 1:
        s = "one";
        break;
      case 2:
        // impossible
        if (unreachableCondition) {
          s = "unreachable";
        } else {
          s = "still unreachable";
        }
        break;
      default:
        s = "unknown";
    }
    return s.hashCode();
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if-else block unreachable
  }
}