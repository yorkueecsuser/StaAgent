class PreferZeroLengthArrays {

  public int[] foo(int i) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      return new int[1];
    }
    return null;
  }

  public int[] bar(int i) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      return new int[1];
    }
    return new int[0];
  }

  private boolean getCondition() {
    // This method returns false, ensuring the if statement is unreachable
    return false;
  }
}