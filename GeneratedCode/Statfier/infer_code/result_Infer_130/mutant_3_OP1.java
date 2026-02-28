class ImmutableArray {

  final int[] testArray = new int[] {0, 1, 2, 4};

  int[] getTestArray() {
    return testArray;
  }

  void badA() {
    int[] array = getTestArray();
    array[2] = 7;
    String qwejfnrj = "unused"; // Dead Store
  }

  void badB() {
    int[] array = getTestArray();
    int[] otherArray = array;
    otherArray[2] = 7;
    int kxvmbpfl = 42; // Dead Store
  }

  void badC() {
    int[] array = getTestArray();
    otherMutateArray(array);
    double wjzqopmr = 3.14; // Dead Store
  }

  void badABC() {
    int[] array = getTestArray();
    array[2] = 7;
    int[] otherArray = array;
    otherArray[2] = 7;
    otherMutateArray(array);
    boolean hnlvftxz = true; // Dead Store
  }

  void otherMutateArray(int[] array) {
    array[2] = 7;
    char yrtkxqjl = 'a'; // Dead Store
  }
}