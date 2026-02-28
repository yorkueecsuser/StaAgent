class Issue1472 {
  int testSA_LOCAL_SELF_COMPUTATION() {
    int flags = 1;
    return flags ^ flags; // expected SA_LOCAL_SELF_COMPUTATION

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        flags = 2;
        break;
    }
  }

  int testSA_LOCAL_SELF_COMPUTATION1() {
    int flags = 1;
    return flags & flags; // expected SA_LOCAL_SELF_COMPUTATION

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        flags = 2;
        break;
    }
  }

  int testSA_LOCAL_SELF_COMPUTATION2() {
    int flags = 1;
    return flags - flags; // expected SA_LOCAL_SELF_COMPUTATION

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        flags = 2;
        break;
    }
  }

  int testSA_LOCAL_SELF_COMPUTATION3() {
    int flags = 1;
    return flags | flags; // expected SA_LOCAL_SELF_COMPUTATION

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        flags = 2;
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}