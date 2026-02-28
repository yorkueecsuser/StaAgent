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
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    for (int i = 0; i <= arr.length; i++) {
      int j = arr[i];
    }
  }

  public void arrayLoopInBoundsOk(int[] arr) {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    for (int i = 0; i < arr.length; i++) {
      int j = arr[i];
    }
  }

  public void FN_buggyIterBad(int[] arr1, int[] arr2) {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = 7;
    }
  }

  public void FN_switchedArrsOutOfBoundsBad() {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    FN_buggyIterBad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop1Bad(int[] arr1, int[] arr2) {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; i < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
  }

  public void FN_nestedOutOfBounds1Bad() {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    FN_buggyNestedLoop1Bad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop2Bad(int[] arr1, int[] arr2) {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; i++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
  }

  public void FN_nestedOutOfBounds2Bad() {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    FN_buggyNestedLoop2Bad(new int[11], new int[10]);
  }

  public void FN_buggyNestedLoop3Bad(int[] arr1, int[] arr2) {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = 2 * arr2[i];
      }
    }
  }

  public void FN_nestedOutOfBounds3Bad() {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    FN_buggyNestedLoop3Bad(new int[11], new int[10]);
  }

  public void safeNestedLoopOk(int[] arr1, int[] arr2) {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
      }
    }
  }

  public void nestedInBoundsOk() {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    safeNestedLoopOk(new int[11], new int[10]);
  }

  private boolean getCondition() {
    return false;
  }
}