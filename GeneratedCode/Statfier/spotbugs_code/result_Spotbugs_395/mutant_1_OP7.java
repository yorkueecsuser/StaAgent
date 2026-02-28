class InterproceduralAnalysisOfNonnullReturnValues {

  String f() {
    return "x";
  }

  int g() {
    String s = f();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    if (s == null) return s.hashCode();
    return 0;
  }

  private boolean getCondition() {
    return false;
  }
}