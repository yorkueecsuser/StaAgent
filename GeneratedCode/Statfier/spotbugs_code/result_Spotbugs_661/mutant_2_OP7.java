class Issue1472 {
  int testSA_LOCAL_SELF_COMPUTATION() {
    int flags = 1;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return flags ^ flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION1() {
    int flags = 1;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return flags & flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION2() {
    int flags = 1;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return flags - flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION3() {
    int flags = 1;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return flags | flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}