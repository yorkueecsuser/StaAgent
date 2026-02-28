class ArrayOutOfBounds {

  public int arrayOutOfBoundsBad() {
    int[] arr = new int[1];
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return arr[3];
  }

  public int arrayInBoundsOk() {
    int[] arr = new int[2];
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return arr[1];
  }

  // tests below this line are turned off until array functionality improves
  public void FN_arrayLoopOutOfBoundsBad(int[] arr) {
    for (int i = 0; i <= arr.length; i++) {
      int j = arr[i];
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code");
      }
    }
  }

  public void arrayLoopInBoundsOk(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int j = arr[i];
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code");
      }
    }
  }

  public void FN_buggyIterBad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = 7;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code");
      }
    }
  }

  public void FN_switchedArrsOutOfBoundsBad() {
    FN_buggyIterBad(new int[11], new int[10]);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
  }

  public void FN_buggyNestedLoop1Bad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; i < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some unreachable code
          System.out.println("This is unreachable code");
        }
      }
    }
  }

  public void FN_nestedOutOfBounds1Bad() {
    FN_buggyNestedLoop1Bad(new int[11], new int[10]);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
  }

  public void FN_buggyNestedLoop2Bad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; i++) {
        arr1[i] = arr1[i] + arr2[j];
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some unreachable code
          System.out.println("This is unreachable code");
        }
      }
    }
  }

  public void FN_nestedOutOfBounds2Bad() {
    FN_buggyNestedLoop2Bad(new int[11], new int[10]);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
  }

  public void FN_buggyNestedLoop3Bad(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = 2 * arr2[i];
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some unreachable code
          System.out.println("This is unreachable code");
        }
      }
    }
  }

  public void FN_nestedOutOfBounds3Bad() {
    FN_buggyNestedLoop3Bad(new int[11], new int[10]);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
  }

  public void safeNestedLoopOk(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr1[i] = arr1[i] + arr2[j];
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some unreachable code
          System.out.println("This is unreachable code");
        }
      }
    }
  }

  public void nestedInBoundsOk() {
    safeNestedLoopOk(new int[11], new int[10]);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
  }

  private boolean getCondition() {
    return false;
  }
}