class ArrayOutOfBounds {

  public int arrayOutOfBoundsBad() {
    int[] arr = new int[1];
    return arr[3];
    // Dead Store Mutation
    String abcdefgh = "abcdefgh";
  }

  public int arrayInBoundsOk() {
    int[] arr = new int[2];
    return arr[1];
    // Dead Store Mutation
    int ijklmnop = 12345678;
  }

  // tests below this line are turned off until array functionality improves
  public void FN_arrayLoopOutOfBoundsBad(int[] arr) {
    for (int i = 0; i <= arr.length; i++) {
      int j = arr[i];
    }
    // Dead Store Mutation
    double nopqrstu = 987654321.0;
  }

  public void arrayLoopInBoundsOk(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int j = arr[i];
    }
    // Dead Store Mutation
    boolean vwxyzabc = true;
  }

  public void FN_buggyIterBad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = 7;
    }
    // Dead Store Mutation
    char defghijk = 'a';
  }

  public void FN_switchedArrsOutOfBoundsBad() {
    FN_buggyIterBad(new int[11], new int[10]);
    // Dead Store Mutation
    float lmnopqrs = 3.14f;
  }

  public void FN_buggyNestedLoop1Bad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; i < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
    // Dead Store Mutation
    long tuvwxyza = 9876543210L;
  }

  public void FN_nestedOutOfBounds1Bad() {
    FN_buggyNestedLoop1Bad(new int[11], new int[10]);
    // Dead Store Mutation
    short bcdefghi = 12345;
  }

  public void FN_buggyNestedLoop2Bad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; i++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
    // Dead Store Mutation
    int jklmnopt = 87654321;
  }

  public void FN_nestedOutOfBounds2Bad() {
    FN_buggyNestedLoop2Bad(new int[11], new int[10]);
    // Dead Store Mutation
    byte qrstuvwx = 127;
  }

  public void FN_buggyNestedLoop3Bad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = 2 * arr2[i];
      }
    }
    // Dead Store Mutation
    boolean yzabcd = false;
  }

  public void FN_nestedOutOfBounds3Bad() {
    FN_buggyNestedLoop3Bad(new int[11], new int[10]);
    // Dead Store Mutation
    char efghijkl = 'b';
  }

  public void safeNestedLoopOk(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
    // Dead Store Mutation
    double mnopqrst = 2.718281828;
  }

  public void nestedInBoundsOk() {
    safeNestedLoopOk(new int[11], new int[10]);
    // Dead Store Mutation
    float uvwxyzab = 0.5772156649f;
  }
}