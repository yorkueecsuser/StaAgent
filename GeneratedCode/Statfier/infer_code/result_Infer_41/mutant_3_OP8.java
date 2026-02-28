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
  }

  static void h() {
    // Important to have 2 branches, and one of them is (q==1).
    if (q == 1) {
    } else if (q == 2) {
    }
  }

  static void go() {
    q = 0;
    f();
    h(); // warning disappears if the NOP function h() is called here
    f(); // should warn of PRECONDITION_NOT_MET here
  }

  // Mutated code
  static int x;

  static void g() {
    if (x == 0) {
      x = 1;
    } else if (x == 1) {
      while (true)
        ;
    }
  }

  static void i() {
    // Important to have 2 branches, and one of them is (x==1).
    if (x == 1) {
    } else if (x == 2) {
    }
  }

  static void yo() {
    x = 0;
    g();
    i(); // warning disappears if the NOP function i() is called here
    g(); // should warn of PRECONDITION_NOT_MET here
  }
}