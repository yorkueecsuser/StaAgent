import codetoanalyze.java.immutability.Immutable;
// @generated

class ArrayTest {
  @Immutable final int[] testArray = new int[] {0, 1, 2, 4};
  @Immutable static String[] suitArray = {"spades", "hearts", "diamonds", "clubs"};
  int[] mutableArray = new int[] {0};

  void array_mod_bad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      int dummy = 0;
    }
    testArray[3] = 3; // modifications to an immutable array are not ok
  }

  int[] get_testArray() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      int dummy = 0;
    }
    return testArray;
  }

  void mutate_array_via_getter_bad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      int dummy = 0;
    }
    int[] array = get_testArray();
    array[2] = 7; // ERROR!
  }

  void mutate_array_via_aliasing_bad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      int dummy = 0;
    }
    int[] array = get_testArray();
    int[] otherArray = array;
    otherArray[2] = 7; // ERROR!
  }

  void mutate_array_via_callee_bad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      int dummy = 0;
    }
    int[] array = get_testArray();
    int[] otherArray = array;
    mutate_param_ok(array); // ERROR!
  }

  void mutate_param_ok(int[] array) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      int dummy = 0;
    }
    array[2] = 7;
  }

  void mutate_static_array_bad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      int dummy = 0;
    }
    suitArray[0] = "pades"; // ERROR!
  }

  void mutable_array_mod_ok() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      int dummy = 0;
    }
    mutableArray[0] = 3; // modifications to mutable arrays are ok
  }

  void mixed_mod_bad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      int dummy = 0;
    }
    mutableArray[0] = 3; // modifications to mutable arrays are ok
    mutate_array_via_callee_bad(); // // modifications to immutables are not
  }

  void mutate_arg_bad(ArrayTest a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      int dummy = 0;
    }
    int[] array = a.get_testArray();
    array[0] = 42;
  }

  void FN_mutate_new_bad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Mutant code
      int dummy = 0;
    }
    ArrayTest a = new ArrayTest();
    int[] array = a.get_testArray();
    array[0] = 42;
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the loops are unreachable
  }
}