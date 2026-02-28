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
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  static void h() {
    // Important to have 2 branches, and one of them is (q==1).
    if (q == 1) {
    } else if (q == 2) {
    }
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  static void go() {
    q = 0;
    f();
    h(); // warning disappears if the NOP function h() is called here
    f(); // should warn of PRECONDITION_NOT_MET here
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  // Helper method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}