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

    // Introduced an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        x = "unreachableCase";
        break;
      default:
        x = "defaultCase";
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}