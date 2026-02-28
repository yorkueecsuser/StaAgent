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
    int i = 0;
    do {
      int j = arr[i];
      i++;
    } while (i <= arr.length);
  }

  public void arrayLoopInBoundsOk(int[] arr) {
    int i = 0;
    do {
      int j = arr[i];
      i++;
    } while (i < arr.length);
  }

  public void FN_buggyIterBad(int[] arr1, int[] arr2) {
    int i = 0;
    do {
      arr2[i] = 7;
      i++;
    } while (i < arr1.length);
  }

  public void FN_switchedArrsOutOfBoundsBad() {
    FN_buggyIterBad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop1Bad(int[] arr1, int[] arr2) {
    int i = 0;
    do {
      int j = 0;
      do {
        arr1[i] = arr1[i] + arr2[j];
        j++;
      } while (i < arr2.length);
      i++;
    } while (i < arr1.length);
  }

  public void FN_nestedOutOfBounds1Bad() {
    FN_buggyNestedLoop1Bad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop2Bad(int[] arr1, int[] arr2) {
    int i = 0;
    do {
      int j = 0;
      do {
        arr1[i] = arr1[i] + arr2[j];
        j++;
      } while (j < arr2.length);
      i++;
    } while (j < arr2.length); // This will cause an unreachable statement error if not fixed, but per instruction, we keep it as is.
  }

  public void FN_nestedOutOfBounds2Bad() {
    FN_buggyNestedLoop2Bad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop3Bad(int[] arr1, int[] arr2) {
    int i = 0;
    do {
      int j = 0;
      do {
        arr1[i] = 2 * arr2[i];
        j++;
      } while (j < arr2.length);
      i++;
    } while (i < arr1.length);
  }

  public void FN_nestedOutOfBounds3Bad() {
    FN_buggyNestedLoop3Bad(new int[11], new int[10]);
  }

  public void safeNestedLoopOk(int[] arr1, int[] arr2) {
    int i = 0;
    do {
      int j = 0;
      do {
        arr1[i] = arr1[i] + arr2[j];
        j++;
      } while (j < arr2.length);
      i++;
    } while (i < arr1.length);
  }

  public void nestedInBoundsOk() {
    safeNestedLoopOk(new int[11], new int[10]);
  }
}