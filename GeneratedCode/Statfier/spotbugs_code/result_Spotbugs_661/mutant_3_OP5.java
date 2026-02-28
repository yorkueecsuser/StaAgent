class Issue1472 {
  int testSA_LOCAL_SELF_COMPUTATION() {
    int flags = 1;
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        flags = 2;
        break;
    }
    return flags ^ flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION1() {
    int flags = 1;
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        flags = 2;
        break;
    }
    return flags & flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION2() {
    int flags = 1;
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        flags = 2;
        break;
    }
    return flags - flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  int testSA_LOCAL_SELF_COMPUTATION3() {
    int flags = 1;
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // Unreachable switch statement
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        flags = 2;
        break;
    }
    return flags | flags; // expected SA_LOCAL_SELF_COMPUTATION
  }

  private boolean getCondition() {
    // This method returns false, making the switch statement unreachable
    return false;
  }
}