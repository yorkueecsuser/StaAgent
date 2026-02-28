class ImmutableArray {

  final int[] testArray = new int[] {0, 1, 2, 4};

  int[] getTestArray() {
    return testArray;
  }

  void badA() {
    int[] array = getTestArray();
    array[2] = 7;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      array[1] = 8;
    } else {
      // Some alternative code that should also never run
      array[1] = 9;
    }
  }

  void badB() {
    int[] array = getTestArray();
    int[] otherArray = array;
    otherArray[2] = 7;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      otherArray[1] = 8;
    } else {
      // Some alternative code that should also never run
      otherArray[1] = 9;
    }
  }

  void badC() {
    int[] array = getTestArray();
    otherMutateArray(array);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      array[1] = 8;
    } else {
      // Some alternative code that should also never run
      array[1] = 9;
    }
  }

  void badABC() {
    int[] array = getTestArray();
    array[2] = 7;
    int[] otherArray = array;
    otherArray[2] = 7;
    otherMutateArray(array);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      array[1] = 8;
    } else {
      // Some alternative code that should also never run
      array[1] = 9;
    }
  }

  void otherMutateArray(int[] array) {
    array[2] = 7;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      array[1] = 8;
    } else {
      // Some alternative code that should also never run
      array[1] = 9;
    }
  }

  boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}