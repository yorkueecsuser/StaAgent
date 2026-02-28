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
    // Mutant code start
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      x = "bar";
    } else {
      // This block will always execute
      x = "baz";
    }
    // Mutant code end
  }

  private boolean getCondition() {
    return false;
  }
}