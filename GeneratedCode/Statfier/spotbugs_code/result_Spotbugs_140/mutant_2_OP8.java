class InitializeInSetupMethod {
  String x;
  String y; // Mutated variable

  @Override
  public int hashCode() {
    return x.hashCode();
  }

  InitializeInSetupMethod() {
    setUp();
  }

  private void setUp() {
    x = "foo";
    y = "bar"; // Mutated variable initialization
  }
}