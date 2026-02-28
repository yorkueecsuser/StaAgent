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

  // Mutant 1: Renaming 'array' to 'b' in badA
  void badA1() {
    int[] b = getTestArray();
    b[2] = 7;
  }

  // Mutant 2: Renaming 'otherArray' to 'c' in badB
  void badB1() {
    int[] array = getTestArray();
    int[] c = array;
    c[2] = 7;
  }

  // Mutant 3: Renaming 'array' to 'd' in badC
  void badC1() {
    int[] d = getTestArray();
    otherMutateArray(d);
  }

  // Mutant 4: Renaming 'array' to 'e' in badABC
  void badABC1() {
    int[] e = getTestArray();
    e[2] = 7;
    int[] otherArray = e;
    otherArray[2] = 7;
    otherMutateArray(e);
  }

  // Mutant 5: Renaming 'array' to 'f' in otherMutateArray
  void otherMutateArray1(int[] f) {
    f[2] = 7;
  }
}