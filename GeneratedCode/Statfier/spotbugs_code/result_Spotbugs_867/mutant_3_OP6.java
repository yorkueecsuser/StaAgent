class PreferZeroLengthArrays {

  public int[] foo(int i) {
    // Unreachable for loop added
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is never set to true
    }
    return null;
  }

  public int[] bar(int i) {
    // Unreachable for loop added
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is never set to true
    }
    return new int[0];
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the loop remains unreachable
  }
}