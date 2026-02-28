// Command: infer -g --biabduction-only
class NopFun {
  static int q;

  static void f() {
    if (q == 0) {
      q = 1;
      // Dead Store Mutation
      String abcdefgh = "abcdefgh";
    } else if (q == 1) {
      while (true)
        ;
    }
  }

  static void h() {
    // Important to have 2 branches, and one of them is (q==1).
    if (q == 1) {
      // Dead Store Mutation
      int ijklmnop = 12345678;
    } else if (q == 2) {
    }
  }

  static void go() {
    q = 0;
    f();
    h(); // warning disappears if the NOP function h() is called here
    f(); // should warn of PRECONDITION_NOT_MET here
    // Dead Store Mutation
    double nopqrstu = 987654321.0;
  }
}