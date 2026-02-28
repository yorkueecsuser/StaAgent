class PreferZeroLengthArrays {

  public int[] foo(int i) {
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      return new int[]{1, 2, 3};
    } else {
      // This block will also never execute because shouldRun is always false
      return new int[]{4, 5, 6};
    }
    return null;
  }

  public int[] bar(int i) {
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      return new int[]{7, 8, 9};
    } else {
      // This block will also never execute because shouldRun is always false
      return new int[]{10, 11, 12};
    }
    return new int[0];
  }

  private boolean getCondition() {
    // Always returns false to ensure the if-else branches are unreachable
    return false;
  }
}