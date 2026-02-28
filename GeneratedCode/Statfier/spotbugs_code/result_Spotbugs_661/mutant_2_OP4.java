class Issue1472 {
  int testSA_LOCAL_SELF_COMPUTATION() {
    int flags = 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      flags = flags + 1;
    } else {
      // Some other unreachable code
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
      // Some other unreachable code
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
      // Some other unreachable code
      flags = flags - 2;
    }
    return flags - flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION3() {
    int flags = 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      flags = flags << 1;
    } else {
      // Some other unreachable code
      flags = flags >> 1;
    }
    return flags | flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}