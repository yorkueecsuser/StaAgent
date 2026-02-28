class ArrayOutOfBounds {

  public int arrayOutOfBoundsBad() {
    int[] arr = new int[1];
    return arr[3];
  }

  public int arrayInBoundsOk() {
    int[] arr = new int[2];
    return arr[1];
  }

  // tests below this line are turned off until array functionality improves
  public void FN_arrayLoopOutOfBoundsBad(int[] arr) {
    for (int i = 0; i <= arr.length; i++) {
      int j = arr[i];
    }
  }

  public void arrayLoopInBoundsOk(int[] arr) {
    for (int x = 0; x < arr.length; x++) {
      int j = arr[x];
    }
  }

  public void FN_buggyIterBad(int[] arr1, int[] arr2) {
    for (int y = 0; y < arr1.length; y++) {
      arr2[y] = 7;
    }
  }

  public void FN_switchedArrsOutOfBoundsBad() {
    FN_buggyIterBad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop1Bad(int[] arr1, int[] arr2) {
    for (int z = 0; z < arr1.length; z++) {
      for (int j = 0; z < arr2.length; j++) {
        arr1[z] = arr1[z] + arr2[j];
      }
    }
  }

  public void FN_nestedOutOfBounds1Bad() {
    FN_buggyNestedLoop1Bad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop2Bad(int[] arr1, int[] arr2) {
    for (int w = 0; w < arr1.length; w++) {
      for (int j = 0; j < arr2.length; w++) {
        arr1[w] = arr1[w] + arr2[j];
      }
    }
  }

  public void FN_nestedOutOfBounds2Bad() {
    FN_buggyNestedLoop2Bad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop3Bad(int[] arr1, int[] arr2) {
    for (int v = 0; v < arr1.length; v++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[v] = 2 * arr2[v];
      }
    }
  }

  public void FN_nestedOutOfBounds3Bad() {
    FN_buggyNestedLoop3Bad(new int[11], new int[10]);
  }

  public void safeNestedLoopOk(int[] arr1, int[] arr2) {
    for (int u = 0; u < arr1.length; u++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[u] = arr1[u] + arr2[j];
      }
    }
  }

  public void nestedInBoundsOk() {
    safeNestedLoopOk(new int[11], new int[10]);
  }
}