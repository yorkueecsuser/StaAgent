class Issue1472 {
  int testSA_LOCAL_SELF_COMPUTATION() {
    int flags = 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      flags += 10;
    } else {
      // Another unreachable code
      flags -= 5;
    }
    return flags ^ flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION1() {
    int flags = 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      flags *= 2;
    } else {
      // Another unreachable code
      flags /= 2;
    }
    return flags & flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION2() {
    int flags = 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      flags++;
    } else {
      // Another unreachable code
      flags--;
    }
    return flags - flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION3() {
    int flags = 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      flags |= 2;
    } else {
      // Another unreachable code
      flags &= 2;
    }
    return flags | flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  private boolean getCondition() {
    // This method can be used to dynamically determine the condition
    return false;
  }
}