class PreferZeroLengthArrays {

  public int[] foo(int i) {
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      return new int[1];
    } else {
      // This block will also never execute because condition is always false
      return new int[2];
    }
    return null;
  }

  public int[] bar(int i) {
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      return new int[3];
    } else {
      // This block will also never execute because condition is always false
      return new int[4];
    }
    return new int[0];
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}