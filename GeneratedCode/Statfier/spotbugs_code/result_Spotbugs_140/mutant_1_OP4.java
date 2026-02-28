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
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      x = "bar";
    } else {
      // This block is unreachable because shouldRun is always false
      x = "baz";
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the else block unreachable
  }
}