class Issue1472 {
  int testSA_LOCAL_SELF_COMPUTATION() {
    int flags = 1;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    return flags ^ flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION1() {
    int flags = 1;
    boolean conditionWhile = getAnotherCondition();
    while (conditionWhile) {
      // This loop is unreachable because getAnotherCondition() always returns false
    }
    return flags & flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION2() {
    int flags = 1;
    boolean conditionWhile = yetAnotherCondition();
    while (conditionWhile) {
      // This loop is unreachable because yetAnotherCondition() always returns false
    }
    return flags - flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION3() {
    int flags = 1;
    boolean conditionWhile = oneMoreCondition();
    while (conditionWhile) {
      // This loop is unreachable because oneMoreCondition() always returns false
    }
    return flags | flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  private boolean getCondition() {
    return false;
  }

  private boolean getAnotherCondition() {
    return false;
  }

  private boolean yetAnotherCondition() {
    return false;
  }

  private boolean oneMoreCondition() {
    return false;
  }
}