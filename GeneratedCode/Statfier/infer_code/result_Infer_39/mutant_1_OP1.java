import codetoanalyze.java.immutability.Immutable;
// @generated

class ArrayTest {
  @Immutable final int[] testArray = new int[] {0, 1, 2, 4};
  @Immutable static String[] suitArray = {"spades", "hearts", "diamonds", "clubs"};
  int[] mutableArray = new int[] {0};

  void array_mod_bad() {
    testArray[3] = 3; // modifications to an immutable array are not ok
    String qzjfnxrb = "unused"; // Dead Store
  }

  int[] get_testArray() {
    return testArray;
  }

  void mutate_array_via_getter_bad() {
    int[] array = get_testArray();
    array[2] = 7; // ERROR!
    int vbnrhtyx = 42; // Dead Store
  }

  void mutate_array_via_aliasing_bad() {
    int[] array = get_testArray();
    int[] otherArray = array;
    otherArray[2] = 7; // ERROR!
    double klmnopqr = 3.14; // Dead Store
  }

  void mutate_array_via_callee_bad() {
    int[] array = get_testArray();
    int[] otherArray = array;
    mutate_param_ok(array); // ERROR!
    char xyzabcde = 'a'; // Dead Store
  }

  void mutate_param_ok(int[] array) {
    array[2] = 7;
    boolean ijklmnop = true; // Dead Store
  }

  void mutate_static_array_bad() {
    suitArray[0] = "pades"; // ERROR!
    float tuvwxyzq = 2.71f; // Dead Store
  }

  void mutable_array_mod_ok() {
    mutableArray[0] = 3; // modifications to mutable arrays are ok
    long rstuvwxy = 987654321L; // Dead Store
  }

  void mixed_mod_bad() {
    mutableArray[0] = 3; // modifications to mutable arrays are ok
    mutate_array_via_callee_bad(); // // modifications to immutables are not
    short abcdefgh = 123; // Dead Store
  }

  void mutate_arg_bad(ArrayTest a) {
    int[] array = a.get_testArray();
    array[0] = 42;
    byte efghijkl = 8; // Dead Store
  }

  void FN_mutate_new_bad() {
    ArrayTest a = new ArrayTest();
    int[] array = a.get_testArray();
    array[0] = 42;
    intmnopq mnopqrst = 456; // Dead Store
  }
}