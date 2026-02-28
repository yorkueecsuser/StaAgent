class PreferZeroLengthArrays {

  public int[] foo(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  public int[] bar(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new int[0];
  }

  private boolean getCondition() {
    return false;
  }
}