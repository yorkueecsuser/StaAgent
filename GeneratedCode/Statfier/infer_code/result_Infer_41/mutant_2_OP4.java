class NopFun {
  static int q;

  static void f() {
    if (q == 0) {
      q = 1;
    } else if (q == 1) {
      while (true)
        ;
    }
    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
    } else {
      // This block is also unreachable because condition is always false
    }
  }

  static void h() {
    // Important to have 2 branches, and one of them is (q==1).
    if (q == 1) {
    } else if (q == 2) {
    }
    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
    } else {
      // This block is also unreachable because condition is always false
    }
  }

  static void go() {
    q = 0;
    f();
    h(); // warning disappears if the NOP function h() is called here
    f(); // should warn of PRECONDITION_NOT_MET here
    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
    } else {
      // This block is also unreachable because condition is always false
    }
  }

  // Method to provide a dynamically determined condition
  private static boolean getCondition() {
    return false; // This method always returns false, making the branches unreachable
  }
}