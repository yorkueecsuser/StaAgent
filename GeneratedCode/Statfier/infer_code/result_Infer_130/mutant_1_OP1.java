class ImmutableArray {

  final int[] testArray = new int[] {0, 1, 2, 4};

  int[] getTestArray() {
    return testArray;
  }

  void badA() {
    int[] array = getTestArray();
    array[2] = 7;
    String jxvqbnrj = "unused"; // Dead Store
  }

  void badB() {
    int[] array = getTestArray();
    int[] otherArray = array;
    otherArray[2] = 7;
    int kflmnpqr = 42; // Dead Store
  }

  void badC() {
    int[] array = getTestArray();
    otherMutateArray(array);
    double pqwertyu = 3.14; // Dead Store
  }

  void badABC() {
    int[] array = getTestArray();
    array[2] = 7;
    int[] otherArray = array;
    otherArray[2] = 7;
    otherMutateArray(array);
    boolean zxcvbnml = true; // Dead Store
  }

  void otherMutateArray(int[] array) {
    array[2] = 7;
    char asdfghjk = 'a'; // Dead Store
  }
}