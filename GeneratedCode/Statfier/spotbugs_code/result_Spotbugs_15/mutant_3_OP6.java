class StringEqualsTest {
  String x;

  public boolean test(String s) {
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return s == "hello";
  }

  public boolean test2(String s) {
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return s == x;
  }

  boolean test3(String s) {
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return s == "hello";
  }

  private boolean getCondition() {
    return false;
  }
}