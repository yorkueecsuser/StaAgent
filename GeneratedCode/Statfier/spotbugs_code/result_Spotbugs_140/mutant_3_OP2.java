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
    x = "foo"; // Original assignment
    x = "bar"; // Mutated assignment (unique and does not invoke a method)
  }
}