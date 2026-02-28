class InitializeInSetupMethod {
  String x;

  @Override
  public int hashCode() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return x.hashCode();
  }

  InitializeInSetupMethod() {
    setUp();
  }

  private void setUp() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    x = "foo";
  }

  private boolean getCondition() {
    return false;
  }
}