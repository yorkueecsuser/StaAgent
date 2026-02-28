import codetoanalyze.java.immutability.Immutable;
// @generated

class ArrayTest {
  @Immutable final int[] testArray = new int[] {0, 1, 2, 4};
  @Immutable static String[] suitArray = {"spades", "hearts", "diamonds", "clubs"};
  int[] mutableArray = new int[] {0};

  void array_mod_bad() {
    testArray[3] = 3; // modifications to an immutable array are not ok
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      testArray[0] = 99; // This line will never be executed
    }
  }

  int[] get_testArray() {
    return testArray;
  }

  void mutate_array_via_getter_bad() {
    int[] array = get_testArray();
    array[2] = 7; // ERROR!
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      array[1] = 88; // This line will never be executed
    }
  }

  void mutate_array_via_aliasing_bad() {
    int[] array = get_testArray();
    int[] otherArray = array;
    otherArray[2] = 7; // ERROR!
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      otherArray[3] = 77; // This line will never be executed
    }
  }

  void mutate_array_via_callee_bad() {
    int[] array = get_testArray();
    int[] otherArray = array;
    mutate_param_ok(array); // ERROR!
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      otherArray[0] = 66; // This line will never be executed
    }
  }

  void mutate_param_ok(int[] array) {
    array[2] = 7;
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      array[1] = 55; // This line will never be executed
    }
  }

  void mutate_static_array_bad() {
    suitArray[0] = "pades"; // ERROR!
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      suitArray[1] = "harts"; // This line will never be executed
    }
  }

  void mutable_array_mod_ok() {
    mutableArray[0] = 3; // modifications to mutable arrays are ok
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      mutableArray[0] = 44; // This line will never be executed
    }
  }

  void mixed_mod_bad() {
    mutableArray[0] = 3; // modifications to mutable arrays are ok
    mutate_array_via_callee_bad(); // // modifications to immutables are not
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      mutableArray[1] = 33; // This line will never be executed
    }
  }

  void mutate_arg_bad(ArrayTest a) {
    int[] array = a.get_testArray();
    array[0] = 42;
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      array[1] = 22; // This line will never be executed
    }
  }

  void FN_mutate_new_bad() {
    ArrayTest a = new ArrayTest();
    int[] array = a.get_testArray();
    array[0] = 42;
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      array[2] = 11; // This line will never be executed
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}