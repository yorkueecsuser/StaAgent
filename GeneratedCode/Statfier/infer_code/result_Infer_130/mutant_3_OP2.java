class ImmutableArray {

  final int[] testArray = new int[] {0, 1, 2, 4};

  int[] getTestArray() {
    return testArray;
  }

  void badA() {
    int[] array = getTestArray();
    array[2] = 7; // Original assignment
    array[2] = 7; // Duplicated assignment
  }

  void badB() {
    int[] array = getTestArray();
    int[] otherArray = array;
    otherArray[2] = 7; // Original assignment
    otherArray[2] = 7; // Duplicated assignment
  }

  void badC() {
    int[] array = getTestArray();
    otherMutateArray(array);
  }

  void badABC() {
    int[] array = getTestArray();
    array[2] = 7; // Original assignment
    array[2] = 7; // Duplicated assignment
    int[] otherArray = array;
    otherArray[2] = 7; // Original assignment
    otherArray[2] = 7; // Duplicated assignment
    otherMutateArray(array);
  }

  void otherMutateArray(int[] array) {
    array[2] = 7; // Original assignment
    array[2] = 7; // Duplicated assignment
  }
}