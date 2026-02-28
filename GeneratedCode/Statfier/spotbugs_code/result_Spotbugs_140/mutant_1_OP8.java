class InitializeInSetupMethod {
  String x;
  String y; // Mutant variable

  @Override
  public int hashCode() {
    return x.hashCode();
  }

  InitializeInSetupMethod() {
    setUp();
  }

  private void setUp() {
    x = "foo";
    y = "bar"; // Mutant initialization
  }
}