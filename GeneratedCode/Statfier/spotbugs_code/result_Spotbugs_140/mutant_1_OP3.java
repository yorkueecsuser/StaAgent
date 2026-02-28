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
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x = "bar"; // This line is unreachable because getCondition() will never return true
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if block unreachable
  }
}