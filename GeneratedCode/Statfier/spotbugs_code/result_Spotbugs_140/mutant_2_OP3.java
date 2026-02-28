class InitializeInSetupMethod {
  String x;

  @Override
  public int hashCode() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      x = "bar";
    }
    return x.hashCode();
  }

  InitializeInSetupMethod() {
    setUp();
  }

  private void setUp() {
    x = "foo";
  }

  private boolean getCondition() {
    return false;
  }
}