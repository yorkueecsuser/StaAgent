class Issue1472 {
  int testSA_LOCAL_SELF_COMPUTATION() {
    int flags = 1;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      flags = flags + 1;
    }
    return flags ^ flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION1() {
    int flags = 1;
    boolean condition = getAnotherCondition();
    if (condition) {
      // Unreachable code
      flags = flags * 2;
    }
    return flags & flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION2() {
    int flags = 1;
    boolean condition = yetAnotherCondition();
    if (condition) {
      // Unreachable code
      flags = flags / 1;
    }
    return flags - flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION3() {
    int flags = 1;
    boolean condition = determineCondition();
    if (condition) {
      // Unreachable code
      flags = flags % 1;
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

  private boolean determineCondition() {
    return false;
  }
}