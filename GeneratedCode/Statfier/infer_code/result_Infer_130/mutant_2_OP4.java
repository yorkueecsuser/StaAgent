class ImmutableArray {

  final int[] testArray = new int[] {0, 1, 2, 4};

  int[] getTestArray() {
    return testArray;
  }

  void badA() {
    int[] array = getTestArray();
    array[2] = 7;

    // Unreachable if-else statement mutation
    boolean condition = getCondition();
    if (condition) {
      array[1] = 8; // This will never execute because condition is always false
    } else {
      array[3] = 9; // This will also never execute because condition is always false
    }
  }

  void badB() {
    int[] array = getTestArray();
    int[] otherArray = array;
    otherArray[2] = 7;

    // Unreachable if-else statement mutation
    boolean condition = getCondition();
    if (condition) {
      array[1] = 8; // This will never execute because condition is always false
    } else {
      array[3] = 9; // This will also never execute because condition is always false
    }
  }

  void badC() {
    int[] array = getTestArray();
    otherMutateArray(array);

    // Unreachable if-else statement mutation
    boolean condition = getCondition();
    if (condition) {
      array[1] = 8; // This will never execute because condition is always false
    } else {
      array[3] = 9; // This will also never execute because condition is always false
    }
  }

  void badABC() {
    int[] array = getTestArray();
    array[2] = 7;
    int[] otherArray = array;
    otherArray[2] = 7;
    otherMutateArray(array);

    // Unreachable if-else statement mutation
    boolean condition = getCondition();
    if (condition) {
      array[1] = 8; // This will never execute because condition is always false
    } else {
      array[3] = 9; // This will also never execute because condition is always false
    }
  }

  void otherMutateArray(int[] array) {
    array[2] = 7;

    // Unreachable if-else statement mutation
    boolean condition = getCondition();
    if (condition) {
      array[1] = 8; // This will never execute because condition is always false
    } else {
      array[3] = 9; // This will also never execute because condition is always false
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}