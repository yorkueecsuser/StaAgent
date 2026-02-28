class PreferZeroLengthArrays {

  public int[] foo(int i) {
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return new int[1];
    }
    return null;
  }

  public int[] bar(int i) {
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return new int[2];
    }
    return new int[0];
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}