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
    int[] array = get_testArray();
    array[2] = 7; // ERROR!
  }

  void mutate_array_via_aliasing_bad() {
    int[] x = get_testArray();
    int[] y = x;
    y[2] = 7; // ERROR!
  }

  void mutate_array_via_callee_bad() {
    int[] z = get_testArray();
    int[] w = z;
    mutate_param_ok(z); // ERROR!
  }

  void mutate_param_ok(int[] v) {
    v[2] = 7;
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

  void mutate_arg_bad(ArrayTest a) {
    int[] b = a.get_testArray();
    b[0] = 42;
  }

  void FN_mutate_new_bad() {
    ArrayTest c = new ArrayTest();
    int[] d = c.get_testArray();
    d[0] = 42;
  }
}