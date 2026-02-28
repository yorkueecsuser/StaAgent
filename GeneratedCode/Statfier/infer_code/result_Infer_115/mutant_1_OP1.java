class ArrayOutOfBounds {

  public int arrayOutOfBoundsBad() {
    int[] arr = new int[1];
    return arr[3];
    // Dead Store Mutation
    int vjdhfzxc = 42;
  }

  public int arrayInBoundsOk() {
    int[] arr = new int[2];
    return arr[1];
    // Dead Store Mutation
    String qweasdzx = "unused";
  }

  // tests below this line are turned off until array functionality improves
  public void FN_arrayLoopOutOfBoundsBad(int[] arr) {
    for (int i = 0; i <= arr.length; i++) {
      int j = arr[i];
    }
    // Dead Store Mutation
    double bnmhgftr = 3.14;
  }

  public void arrayLoopInBoundsOk(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int j = arr[i];
    }
    // Dead Store Mutation
    boolean cvbnmkjh = true;
  }

  public void FN_buggyIterBad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = 7;
    }
    // Dead Store Mutation
    char yuiopasd = 'a';
  }

  public void FN_switchedArrsOutOfBoundsBad() {
    FN_buggyIterBad(new int[11], new int[10]);
    // Dead Store Mutation
    long poiuytrew = 987654321L;
  }

  public void FN_buggyNestedLoop1Bad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; i < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
    // Dead Store Mutation
    float lkjhgfds = 2.718f;
  }

  public void FN_nestedOutOfBounds1Bad() {
    FN_buggyNestedLoop1Bad(new int[11], new int[10]);
    // Dead Store Mutation
    short zxcvbnml = 123;
  }

  public void FN_buggyNestedLoop2Bad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; i++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
    // Dead Store Mutation
    int asdfghjk = 456;
  }

  public void FN_nestedOutOfBounds2Bad() {
    FN_buggyNestedLoop2Bad(new int[11], new int[10]);
    // Dead Store Mutation
    byte qwertyui = 78;
  }

  public void FN_buggyNestedLoop3Bad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = 2 * arr2[i];
      }
    }
    // Dead Store Mutation
    boolean edcfvghb = false;
  }

  public void FN_nestedOutOfBounds3Bad() {
    FN_buggyNestedLoop3Bad(new int[11], new int[10]);
    // Dead Store Mutation
    long rtyuiop = 1234567890L;
  }

  public void safeNestedLoopOk(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
    // Dead Store Mutation
    float poiuyt = 0.577f;
  }

  public void nestedInBoundsOk() {
    safeNestedLoopOk(new int[11], new int[10]);
    // Dead Store Mutation
    double mnbvcxza = 1.618;
  }
}