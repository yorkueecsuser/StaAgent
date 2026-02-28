class Issue1472 {
  int testSA_LOCAL_SELF_COMPUTATION() {
    int flags = 1;
    return flags ^ flags; // expected SA_LOCAL_SELF_COMPUTATION

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        int unreachableVar = 10;
        break;
    }
  }

  int testSA_LOCAL_SELF_COMPUTATION1() {
    int flags = 1;
    return flags & flags; // expected SA_LOCAL_SELF_COMPUTATION

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        int unreachableVar = 20;
        break;
    }
  }

  int testSA_LOCAL_SELF_COMPUTATION2() {
    int flags = 1;
    return flags - flags; // expected SA_LOCAL_SELF_COMPUTATION

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        int unreachableVar = 30;
        break;
    }
  }

  int testSA_LOCAL_SELF_COMPUTATION3() {
    int flags = 1;
    return flags | flags; // expected SA_LOCAL_SELF_COMPUTATION

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        int unreachableVar = 40;
        break;
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}