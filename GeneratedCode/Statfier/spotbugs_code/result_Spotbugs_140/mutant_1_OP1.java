class InitializeInSetupMethod {
  String x;

  @Override
  public int hashCode() {
    return x.hashCode();
  }

  InitializeInSetupMethod() {
    setUp();
    // Dead Store Mutation
    String jxqfvtbn = "unusedValue";
  }

  private void setUp() {
    x = "foo";
  }
}