class Bug1726846 {

  private static final int[] INTS = {1, 2, 3};

  public static final int[] getInts() {
    return INTS;
  }

  private static int theStatic = 0;

  public void bug() {
    // Here is a write to a static field from an instance method
    theStatic = 17;

    // Introduced an unreachable if statement based on the mutation operator
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      theStatic = 42;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}