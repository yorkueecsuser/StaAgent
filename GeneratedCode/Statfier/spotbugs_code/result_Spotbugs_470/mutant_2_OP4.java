class Bug1726846 {

  private static final int[] INTS = {1, 2, 3};

  public static final int[] getInts() {
    return INTS;
  }

  private static int theStatic = 0;

  public void bug() {
    // Here is a write to a static field from an instance method
    theStatic = 17;

    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      theStatic = 42;
    } else {
      // This block will also never execute for the same reason
      theStatic = 24;
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if-else branches are unreachable
    return false;
  }
}