class InitializeInSetupMethod {
  String x;

  @Override
  public int hashCode() {
    return x.hashCode();
  }

  InitializeInSetupMethod() {
    setUp();
  }

  private void setUp() {
    x = "foo";
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x = "bar"; // This line is unreachable because getCondition() will never return true
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}