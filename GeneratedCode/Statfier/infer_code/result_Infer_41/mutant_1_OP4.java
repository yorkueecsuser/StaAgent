// Command: infer -g --biabduction-only
class NopFun {
  static int q;

  static void f() {
    if (q == 0) {
      q = 1;
    } else if (q == 1) {
      while (true)
        ;
    }
    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  static void h() {
    // Important to have 2 branches, and one of them is (q==1).
    if (q == 1) {
    } else if (q == 2) {
    }
    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  static void go() {
    q = 0;
    f();
    h(); // warning disappears if the NOP function h() is called here
    f(); // should warn of PRECONDITION_NOT_MET here
    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
    } else {
      // This block will also never be executed because condition is always false
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}