class PreferZeroLengthArrays {

  public int[] foo(int i) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is dynamically determined and not set to true
    }
    return null;
  }

  public int[] bar(int i) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is dynamically determined and not set to true
    }
    return new int[0];
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}