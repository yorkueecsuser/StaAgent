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
    int[] array = getTestArray();
    int[] otherArray = array;
    otherArray[2] = 7;
  }

  void badC() {
    int[] array = getTestArray();
    otherMutateArray(array);
  }

  void badABC() {
    int[] array = getTestArray();
    array[2] = 7;
    int[] otherArray = array;
    otherArray[2] = 7;
    otherMutateArray(array);
  }

  void otherMutateArray(int[] array) {
    array[2] = 7;
  }

  // Mutated methods with renamed variables

  void badAa() {
    int[] x = getTestArray();
    x[2] = 7;
  }

  void badBb() {
    int[] y = getTestArray();
    int[] z = y;
    z[2] = 7;
  }

  void badCc() {
    int[] w = getTestArray();
    otherMutateArray(w);
  }

  void badAbc() {
    int[] v = getTestArray();
    v[2] = 7;
    int[] u = v;
    u[2] = 7;
    otherMutateArray(v);
  }

  void otherMutateArrayy(int[] t) {
    t[2] = 7;
  }
}