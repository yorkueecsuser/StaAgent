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
    // Inserting unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable
      q = 2;
    } else {
      // This block is also unreachable
      q = 3;
    }
  }

  static void h() {
    // Important to have 2 branches, and one of them is (q==1).
    if (q == 1) {
    } else if (q == 2) {
    }
    // Inserting unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable
      q = 4;
    } else {
      // This block is also unreachable
      q = 5;
    }
  }

  static void go() {
    q = 0;
    f();
    h(); // warning disappears if the NOP function h() is called here
    f(); // should warn of PRECONDITION_NOT_MET here
    // Inserting unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable
      q = 6;
    } else {
      // This block is also unreachable
      q = 7;
    }
  }

  // Method to provide a dynamic condition for unreachable branches
  static boolean getUnreachableCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}