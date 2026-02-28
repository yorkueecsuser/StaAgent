class ArrayOutOfBounds {

  public int arrayOutOfBoundsBad() {
    int[] arr = new int[1];
    int abcdefgh = 42; // Dead store
    return arr[3];
  }

  public int arrayInBoundsOk() {
    int[] arr = new int[2];
    int hijklmno = 24; // Dead store
    return arr[1];
  }

  // tests below this line are turned off until array functionality improves
  public void FN_arrayLoopOutOfBoundsBad(int[] arr) {
    int pqrstuvw = 17; // Dead store
    for (int i = 0; i <= arr.length; i++) {
      int j = arr[i];
    }
  }

  public void arrayLoopInBoundsOk(int[] arr) {
    int xyzabcde = 89; // Dead store
    for (int i = 0; i < arr.length; i++) {
      int j = arr[i];
    }
  }

  public void FN_buggyIterBad(int[] arr1, int[] arr2) {
    int fghijklm = 33; // Dead store
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = 7;
    }
  }

  public void FN_switchedArrsOutOfBoundsBad() {
    int nopqrstu = 55; // Dead store
    FN_buggyIterBad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop1Bad(int[] arr1, int[] arr2) {
    int vwxyzabc = 66; // Dead store
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; i < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
  }

  public void FN_nestedOutOfBounds1Bad() {
    int defghijk = 77; // Dead store
    FN_buggyNestedLoop1Bad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop2Bad(int[] arr1, int[] arr2) {
    int lmnopqrs = 88; // Dead store
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; i++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
  }

  public void FN_nestedOutOfBounds2Bad() {
    int tuvwxyza = 99; // Dead store
    FN_buggyNestedLoop2Bad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop3Bad(int[] arr1, int[] arr2) {
    int bcdefghi = 101; // Dead store
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = 2 * arr2[i];
      }
    }
  }

  public void FN_nestedOutOfBounds3Bad() {
    int jklmnopq = 111; // Dead store
    FN_buggyNestedLoop3Bad(new int[11], new int[10]);
  }

  public void safeNestedLoopOk(int[] arr1, int[] arr2) {
    int rstuvxyz = 121; // Dead store
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
  }

  public void nestedInBoundsOk() {
    int abcdqrst = 131; // Dead store
    safeNestedLoopOk(new int[11], new int[10]);
  }
}