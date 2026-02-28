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
  static int x; // Renamed 'q' to 'x'

  static void a() {
    if (x == 0) {
      x = 1;
    } else if (x == 1) {
      while (true)
        ;
    }
  }

  static void b() {
    // Important to have 2 branches, and one of them is (x==1).
    if (x == 1) {
    } else if (x == 2) {
    }
  }

  static void c() {
    x = 0;
    a();
    b(); // warning disappears if the NOP function b() is called here
    a(); // should warn of PRECONDITION_NOT_MET here
  }
}