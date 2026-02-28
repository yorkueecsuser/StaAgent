class PreferZeroLengthArrays {

  public int[] foo(int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable loop body
    }
    return null;
  }

  public int[] bar(int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable loop body
    }
    return new int[0];
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}