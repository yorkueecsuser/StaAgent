class InitializeInSetupMethod {
  String x;

  @Override
  public int hashCode() {
    return x.hashCode();
  }

  InitializeInSetupMethod() {
    setUp();
    // Dead store mutation
    String qzjfnvxt = "unusedVariable";
  }

  private void setUp() {
    x = "foo";
  }
}