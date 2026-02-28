class InitializeInSetupMethod {
  String x;

  @Override
  public int hashCode() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
      x = "unreachable";
    }
    return x.hashCode();
  }

  InitializeInSetupMethod() {
    setUp();
  }

  private void setUp() {
    x = "foo";
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}