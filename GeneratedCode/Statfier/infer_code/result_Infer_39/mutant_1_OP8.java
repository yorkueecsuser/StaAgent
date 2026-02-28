import codetoanalyze.java.immutability.Immutable;
// @generated

class ArrayTest {
  @Immutable final int[] testArray = new int[] {0, 1, 2, 4};
  @Immutable static String[] suitArray = {"spades", "hearts", "diamonds", "clubs"};
  int[] mutableArray = new int[] {0};

  void array_mod_bad() {
    testArray[3] = 3; // modifications to an immutable array are not ok
  }

  int[] get_testArray() {
    return testArray;
  }

  void mutate_array_via_getter_bad() {
    int[] x = get_testArray();
    x[2] = 7; // ERROR!
  }

  void mutate_array_via_aliasing_bad() {
    int[] y = get_testArray();
    int[] z = y;
    z[2] = 7; // ERROR!
  }

  void mutate_array_via_callee_bad() {
    int[] w = get_testArray();
    int[] v = w;
    mutate_param_ok(w); // ERROR!
  }

  void mutate_param_ok(int[] u) {
    u[2] = 7;
  }

  void mutate_static_array_bad() {
    suitArray[0] = "pades"; // ERROR!
  }

  void mutable_array_mod_ok() {
    mutableArray[0] = 3; // modifications to mutable arrays are ok
  }

  void mixed_mod_bad() {
    mutableArray[0] = 3; // modifications to mutable arrays are ok
    mutate_array_via_callee_bad(); // // modifications to immutables are not
  }

  void mutate_arg_bad(ArrayTest t) {
    int[] s = t.get_testArray();
    s[0] = 42;
  }

  void FN_mutate_new_bad() {
    ArrayTest r = new ArrayTest();
    int[] q = r.get_testArray();
    q[0] = 42;
  }
}