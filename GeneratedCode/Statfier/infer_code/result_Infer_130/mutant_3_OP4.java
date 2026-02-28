class ImmutableArray {

  final int[] testArray = new int[] {0, 1, 2, 4};

  int[] getTestArray() {
    return testArray;
  }

  void badA() {
    int[] array = getTestArray();
    array[2] = 7;

    // Unreachable if-else statement mutation
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      array[1] = 8;
    } else {
      // This block will always execute
      array[3] = 9;
    }
  }

  void badB() {
    int[] array = getTestArray();
    int[] otherArray = array;
    otherArray[2] = 7;

    // Unreachable if-else statement mutation
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      otherArray[1] = 8;
    } else {
      // This block will always execute
      otherArray[3] = 9;
    }
  }

  void badC() {
    int[] array = getTestArray();
    otherMutateArray(array);

    // Unreachable if-else statement mutation
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      array[1] = 8;
    } else {
      // This block will always execute
      array[3] = 9;
    }
  }

  void badABC() {
    int[] array = getTestArray();
    array[2] = 7;
    int[] otherArray = array;
    otherArray[2] = 7;
    otherMutateArray(array);

    // Unreachable if-else statement mutation
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      array[1] = 8;
    } else {
      // This block will always execute
      array[3] = 9;
    }
  }

  void otherMutateArray(int[] array) {
    array[2] = 7;

    // Unreachable if-else statement mutation
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      array[1] = 8;
    } else {
      // This block will always execute
      array[3] = 9;
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}