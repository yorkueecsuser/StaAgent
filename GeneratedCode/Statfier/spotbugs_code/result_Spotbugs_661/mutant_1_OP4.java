class Issue1472 {
  int testSA_LOCAL_SELF_COMPUTATION() {
    int flags = 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      flags = flags + 1;
    } else {
      // Another unreachable code
      flags = flags - 1;
    }
    return flags ^ flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION1() {
    int flags = 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      flags = flags * 2;
    } else {
      // Another unreachable code
      flags = flags / 2;
    }
    return flags & flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION2() {
    int flags = 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      flags = flags + 2;
    } else {
      // Another unreachable code
      flags = flags - 2;
    }
    return flags - flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION3() {
    int flags = 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      flags = flags | 2;
    } else {
      // Another unreachable code
      flags = flags & 2;
    }
    return flags | flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  private boolean getCondition() {
    // This method ensures the condition is not a compile-time constant
    return false;
  }
}