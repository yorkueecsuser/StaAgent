class StringEqualsTest {
  String x;

  public boolean test(String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return s == "hello";
  }

  public boolean test2(String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return s == x;
  }

  boolean test3(String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return s == "hello";
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the loop is unreachable
  }
}