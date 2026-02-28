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
      // Unreachable if statement
      testArray[2] = 8; // This line is logically unreachable due to the condition
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
      // Unreachable if statement
      array[1] = 9; // This line is logically unreachable due to the condition
    }
  }

  void mutate_array_via_aliasing_bad() {
    int[] array = get_testArray();
    int[] otherArray = array;
    otherArray[2] = 7; // ERROR!
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      otherArray[3] = 10; // This line is logically unreachable due to the condition
    }
  }

  void mutate_array_via_callee_bad() {
    int[] array = get_testArray();
    int[] otherArray = array;
    mutate_param_ok(array); // ERROR!
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      otherArray[0] = 11; // This line is logically unreachable due to the condition
    }
  }

  void mutate_param_ok(int[] array) {
    array[2] = 7;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      array[1] = 12; // This line is logically unreachable due to the condition
    }
  }

  void mutate_static_array_bad() {
    suitArray[0] = "pades"; // ERROR!
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      suitArray[1] = "harts"; // This line is logically unreachable due to the condition
    }
  }

  void mutable_array_mod_ok() {
    mutableArray[0] = 3; // modifications to mutable arrays are ok
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      mutableArray[1] = 13; // This line is logically unreachable due to the condition
    }
  }

  void mixed_mod_bad() {
    mutableArray[0] = 3; // modifications to mutable arrays are ok
    mutate_array_via_callee_bad(); // // modifications to immutables are not
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      mutableArray[2] = 14; // This line is logically unreachable due to the condition
    }
  }

  void mutate_arg_bad(ArrayTest a) {
    int[] array = a.get_testArray();
    array[0] = 42;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      array[1] = 15; // This line is logically unreachable due to the condition
    }
  }

  void FN_mutate_new_bad() {
    ArrayTest a = new ArrayTest();
    int[] array = a.get_testArray();
    array[0] = 42;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      array[2] = 16; // This line is logically unreachable due to the condition
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, making the if blocks unreachable
  }
}