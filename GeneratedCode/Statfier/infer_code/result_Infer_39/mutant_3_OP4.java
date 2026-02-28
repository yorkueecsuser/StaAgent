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
      // Some unreachable code
      testArray[0] = 99;
    } else {
      // Another unreachable code
      testArray[1] = 98;
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
      // Some unreachable code
      array[1] = 99;
    } else {
      // Another unreachable code
      array[0] = 98;
    }
  }

  void mutate_array_via_aliasing_bad() {
    int[] array = get_testArray();
    int[] otherArray = array;
    otherArray[2] = 7; // ERROR!
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      otherArray[1] = 99;
    } else {
      // Another unreachable code
      otherArray[0] = 98;
    }
  }

  void mutate_array_via_callee_bad() {
    int[] array = get_testArray();
    int[] otherArray = array;
    mutate_param_ok(array); // ERROR!
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      otherArray[1] = 99;
    } else {
      // Another unreachable code
      otherArray[0] = 98;
    }
  }

  void mutate_param_ok(int[] array) {
    array[2] = 7;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      array[1] = 99;
    } else {
      // Another unreachable code
      array[0] = 98;
    }
  }

  void mutate_static_array_bad() {
    suitArray[0] = "pades"; // ERROR!
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      suitArray[1] = "hearts99";
    } else {
      // Another unreachable code
      suitArray[2] = "diamonds98";
    }
  }

  void mutable_array_mod_ok() {
    mutableArray[0] = 3; // modifications to mutable arrays are ok
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      mutableArray[1] = 99;
    } else {
      // Another unreachable code
      mutableArray[0] = 98;
    }
  }

  void mixed_mod_bad() {
    mutableArray[0] = 3; // modifications to mutable arrays are ok
    mutate_array_via_callee_bad(); // // modifications to immutables are not
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      mutableArray[1] = 99;
    } else {
      // Another unreachable code
      mutableArray[0] = 98;
    }
  }

  void mutate_arg_bad(ArrayTest a) {
    int[] array = a.get_testArray();
    array[0] = 42;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      array[1] = 99;
    } else {
      // Another unreachable code
      array[0] = 98;
    }
  }

  void FN_mutate_new_bad() {
    ArrayTest a = new ArrayTest();
    int[] array = a.get_testArray();
    array[0] = 42;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      array[1] = 99;
    } else {
      // Another unreachable code
      array[0] = 98;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}