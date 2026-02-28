class ImmutableArray {

  final int[] testArray = new int[] {0, 1, 2, 4};

  int[] getTestArray() {
    return testArray;
  }

  void badA() {
    int[] array = getTestArray();
    array[2] = 7;
  }

  void badB() {
    int[] x = getTestArray(); // Mutated variable name from 'array' to 'x'
    int[] otherArray = x;
    otherArray[2] = 7;
  }

  void badC() {
    int[] y = getTestArray(); // Mutated variable name from 'array' to 'y'
    otherMutateArray(y);
  }

  void badABC() {
    int[] z = getTestArray(); // Mutated variable name from 'array' to 'z'
    z[2] = 7;
    int[] otherArray = z;
    otherArray[2] = 7;
    otherMutateArray(z);
  }

  void otherMutateArray(int[] w) { // Mutated parameter name from 'array' to 'w'
    w[2] = 7;
  }
}