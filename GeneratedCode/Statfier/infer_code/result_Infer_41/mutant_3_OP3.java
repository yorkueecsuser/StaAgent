class NopFun {
  static int q;

  static void f() {
    if (q == 0) {
      q = 1;
    } else if (q == 1) {
      while (true)
        ;
    }
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      q = 2;
    }
  }

  static void h() {
    // Important to have 2 branches, and one of them is (q==1).
    if (q == 1) {
    } else if (q == 2) {
    }
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      q = 3;
    }
  }

  static void go() {
    q = 0;
    f();
    h(); // warning disappears if the NOP function h() is called here
    f(); // should warn of PRECONDITION_NOT_MET here
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      q = 4;
    }
  }

  // Method to provide a dynamic condition that will never be true
  private static boolean getCondition() {
    return false;
  }
}