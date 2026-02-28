class PreferZeroLengthArrays {

  public int[] foo(int i) {
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      return new int[1];
    }
    return null;
  }

  public int[] bar(int i) {
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      return new int[1];
    }
    return new int[0];
  }

  // Helper method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}