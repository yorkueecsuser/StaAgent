class InSwitchStatement {

  int f(int x) {
    String s = null;
    boolean condition = getCondition(); // Ensure the condition is dynamically determined

    switch (x) {
      case 0:
        s = "zero";
        break;
      case 1:
        s = "one";
        break;
      case 2:
        // impossible
        if (condition) { // Inserting unreachable if branch
          s = "unreachable"; // This branch is unreachable because condition is always false
        }
        break;
      default:
        s = "unknown";
    }
    return s.hashCode();
  }

  private boolean getCondition() {
    return false; // This method returns false, making the if branch unreachable
  }
}