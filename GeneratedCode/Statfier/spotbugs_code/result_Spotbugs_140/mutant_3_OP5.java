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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        x = "unreachable";
        break;
      case 1:
        // This case is always executed
        x = "bar";
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the first case in the switch unreachable
    return false;
  }
}