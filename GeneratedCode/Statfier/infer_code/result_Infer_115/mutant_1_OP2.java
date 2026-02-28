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
      int j2 = arr[i]; // Mutation: duplicated assignment
    }
  }

  public void arrayLoopInBoundsOk(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int j = arr[i];
      int j2 = arr[i]; // Mutation: duplicated assignment
    }
  }

  public void FN_buggyIterBad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = 7;
      arr2[i] = 7; // Mutation: duplicated assignment
    }
  }

  public void FN_switchedArrsOutOfBoundsBad() {
    FN_buggyIterBad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop1Bad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; i < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
        arr1[i] = arr1[i] + arr2[j]; // Mutation: duplicated assignment
      }
    }
  }

  public void FN_nestedOutOfBounds1Bad() {
    FN_buggyNestedLoop1Bad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop2Bad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; i++) {
        arr1[i] = arr1[i] + arr2[j];
        arr1[i] = arr1[i] + arr2[j]; // Mutation: duplicated assignment
      }
    }
  }

  public void FN_nestedOutOfBounds2Bad() {
    FN_buggyNestedLoop2Bad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop3Bad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = 2 * arr2[i];
        arr1[i] = 2 * arr2[i]; // Mutation: duplicated assignment
      }
    }
  }

  public void FN_nestedOutOfBounds3Bad() {
    FN_buggyNestedLoop3Bad(new int[11], new int[10]);
  }

  public void safeNestedLoopOk(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
        arr1[i] = arr1[i] + arr2[j]; // Mutation: duplicated assignment
      }
    }
  }

  public void nestedInBoundsOk() {
    safeNestedLoopOk(new int[11], new int[10]);
  }
}