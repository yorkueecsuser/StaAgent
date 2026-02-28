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
    boolean condition = getCondition();
    for (int i = 0; condition; i++) { // Unreachable for loop
      int j = arr[i];
    }
    for (int i = 0; i <= arr.length; i++) {
      int j = arr[i];
    }
  }

  public void arrayLoopInBoundsOk(int[] arr) {
    boolean condition = getCondition();
    for (int i = 0; condition; i++) { // Unreachable for loop
      int j = arr[i];
    }
    for (int i = 0; i < arr.length; i++) {
      int j = arr[i];
    }
  }

  public void FN_buggyIterBad(int[] arr1, int[] arr2) {
    boolean condition = getCondition();
    for (int i = 0; condition; i++) { // Unreachable for loop
      arr2[i] = 7;
    }
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = 7;
    }
  }

  public void FN_switchedArrsOutOfBoundsBad() {
    boolean condition = getCondition();
    for (int i = 0; condition; i++) { // Unreachable for loop
      FN_buggyIterBad(new int[11], new int[10]);
    }
    FN_buggyIterBad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop1Bad(int[] arr1, int[] arr2) {
    boolean condition = getCondition();
    for (int i = 0; condition; i++) { // Unreachable for loop
      for (int j = 0; i < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; i < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
  }

  public void FN_nestedOutOfBounds1Bad() {
    boolean condition = getCondition();
    for (int i = 0; condition; i++) { // Unreachable for loop
      FN_buggyNestedLoop1Bad(new int[11], new int[10]);
    }
    FN_buggyNestedLoop1Bad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop2Bad(int[] arr1, int[] arr2) {
    boolean condition = getCondition();
    for (int i = 0; condition; i++) { // Unreachable for loop
      for (int j = 0; j < arr2.length; i++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; i++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
  }

  public void FN_nestedOutOfBounds2Bad() {
    boolean condition = getCondition();
    for (int i = 0; condition; i++) { // Unreachable for loop
      FN_buggyNestedLoop2Bad(new int[11], new int[10]);
    }
    FN_buggyNestedLoop2Bad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop3Bad(int[] arr1, int[] arr2) {
    boolean condition = getCondition();
    for (int i = 0; condition; i++) { // Unreachable for loop
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = 2 * arr2[i];
      }
    }
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = 2 * arr2[i];
      }
    }
  }

  public void FN_nestedOutOfBounds3Bad() {
    boolean condition = getCondition();
    for (int i = 0; condition; i++) { // Unreachable for loop
      FN_buggyNestedLoop3Bad(new int[11], new int[10]);
    }
    FN_buggyNestedLoop3Bad(new int[11], new int[10]);
  }

  public void safeNestedLoopOk(int[] arr1, int[] arr2) {
    boolean condition = getCondition();
    for (int i = 0; condition; i++) { // Unreachable for loop
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
  }

  public void nestedInBoundsOk() {
    boolean condition = getCondition();
    for (int i = 0; condition; i++) { // Unreachable for loop
      safeNestedLoopOk(new int[11], new int[10]);
    }
    safeNestedLoopOk(new int[11], new int[10]);
  }

  private boolean getCondition() {
    return false;
  }
}