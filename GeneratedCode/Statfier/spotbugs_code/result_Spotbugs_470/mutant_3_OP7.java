class Bug1726846 {

  private static final int[] INTS = {1, 2, 3};

  public static final int[] getInts() {
    return INTS;
  }

  private static int theStatic = 0;

  public void bug() {
    // Here is a write to a static field from an instance method
    theStatic = 17;

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will always be false
    }
  }

  private boolean getCondition() {
    return false;
  }
}