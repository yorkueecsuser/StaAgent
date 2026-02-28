class InitializeInSetupMethod {
  String x;

  @Override
  public int hashCode() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x = "unreachable";
    } else {
      // Another unreachable code
      x = "another unreachable";
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
    // This method ensures the condition is not a compile-time constant
    return false;
  }
}