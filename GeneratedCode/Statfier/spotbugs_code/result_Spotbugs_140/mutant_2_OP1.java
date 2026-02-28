class InitializeInSetupMethod {
  String x;

  @Override
  public int hashCode() {
    return x.hashCode();
  }

  InitializeInSetupMethod() {
    setUp();
    // Dead Store Mutation
    String jxvqbnrt = "unusedVariable";
  }

  private void setUp() {
    x = "foo";
  }
}