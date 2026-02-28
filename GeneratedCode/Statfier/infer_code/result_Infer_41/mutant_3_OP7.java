class NopFun {
  static int q;

  static void f() {
    if (q == 0) {
      q = 1;
    } else if (q == 1) {
      while (true)
        ;
    }
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  static void h() {
    // Important to have 2 branches, and one of them is (q==1).
    if (q == 1) {
    } else if (q == 2) {
    }
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  static void go() {
    q = 0;
    f();
    h(); // warning disappears if the NOP function h() is called here
    f(); // should warn of PRECONDITION_NOT_MET here
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  // Method to provide a dynamic condition for the while loop
  static boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}