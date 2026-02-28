class ImmutableArray {

  final int[] testArray = new int[] {0, 1, 2, 4};

  int[] getTestArray() {
    return testArray;
  }

  void badA() {
    int[] array = getTestArray();
    array[2] = 7;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      array[3] = 9;
    }
  }

  void badB() {
    int[] array = getTestArray();
    int[] otherArray = array;
    otherArray[2] = 7;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      otherArray[3] = 9;
    }
  }

  void badC() {
    int[] array = getTestArray();
    otherMutateArray(array);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      array[3] = 9;
    }
  }

  void badABC() {
    int[] array = getTestArray();
    array[2] = 7;
    int[] otherArray = array;
    otherArray[2] = 7;
    otherMutateArray(array);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      array[3] = 9;
    }
  }

  void otherMutateArray(int[] array) {
    array[2] = 7;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      array[3] = 9;
    }
  }

  boolean getCondition() {
    return false;
  }
}