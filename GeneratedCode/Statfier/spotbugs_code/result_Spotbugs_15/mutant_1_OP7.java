class StringEqualsTest {
  String x;

  public boolean test(String s) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return s == "hello";
  }

  public boolean test2(String s) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return s == x;
  }

  boolean test3(String s) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return s == "hello";
  }

  private boolean getCondition() {
    return false; // This method returns false, but the condition is dynamically determined at runtime
  }
}