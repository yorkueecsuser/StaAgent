class StringEqualsTest {
  String x;

  public boolean test(String s) {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return s == "hello";
  }

  public boolean test2(String s) {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return s == x;
  }

  boolean test3(String s) {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return s == "hello";
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}