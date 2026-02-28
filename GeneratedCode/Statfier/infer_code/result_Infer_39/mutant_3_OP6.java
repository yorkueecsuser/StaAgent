import codetoanalyze.java.immutability.Immutable;
// @generated

class ArrayTest {
  @Immutable final int[] testArray = new int[] {0, 1, 2, 4};
  @Immutable static String[] suitArray = {"spades", "hearts", "diamonds", "clubs"};
  int[] mutableArray = new int[] {0};

  void array_mod_bad() {
    testArray[3] = 3; // modifications to an immutable array are not ok
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  int[] get_testArray() {
    return testArray;
  }

  void mutate_array_via_getter_bad() {
    int[] array = get_testArray();
    array[2] = 7; // ERROR!
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  void mutate_array_via_aliasing_bad() {
    int[] array = get_testArray();
    int[] otherArray = array;
    otherArray[2] = 7; // ERROR!
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  void mutate_array_via_callee_bad() {
    int[] array = get_testArray();
    int[] otherArray = array;
    mutate_param_ok(array); // ERROR!
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  void mutate_param_ok(int[] array) {
    array[2] = 7;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  void mutate_static_array_bad() {
    suitArray[0] = "pades"; // ERROR!
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  void mutable_array_mod_ok() {
    mutableArray[0] = 3; // modifications to mutable arrays are ok
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  void mixed_mod_bad() {
    mutableArray[0] = 3; // modifications to mutable arrays are ok
    mutate_array_via_callee_bad(); // // modifications to immutables are not
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  void mutate_arg_bad(ArrayTest a) {
    int[] array = a.get_testArray();
    array[0] = 42;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  void FN_mutate_new_bad() {
    ArrayTest a = new ArrayTest();
    int[] array = a.get_testArray();
    array[0] = 42;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined but returns false
  }
}