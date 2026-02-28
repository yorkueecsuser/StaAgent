class ImmutableArray {

  final int[] testArray = new int[] {0, 1, 2, 4};

  int[] getTestArray() {
    return testArray;
  }

  void badA() {
    int[] array = getTestArray();
    array[2] = 7;
    // Dead store mutation
    int abcdefgh = 42;
  }

  void badB() {
    int[] array = getTestArray();
    int[] otherArray = array;
    otherArray[2] = 7;
    // Dead store mutation
    String ijklmnop = "unused";
  }

  void badC() {
    int[] array = getTestArray();
    otherMutateArray(array);
    // Dead store mutation
    double qrstuvwx = 3.14;
  }

  void badABC() {
    int[] array = getTestArray();
    array[2] = 7;
    int[] otherArray = array;
    otherArray[2] = 7;
    otherMutateArray(array);
    // Dead store mutation
    boolean yzabcdef = true;
  }

  void otherMutateArray(int[] array) {
    array[2] = 7;
    // Dead store mutation
    char ghijklmn = 'x';
  }
}