class StringEqualsTest {
  String x;

  public boolean test(String s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a placeholder comment for the if block
    } else {
      // This is a placeholder comment for the else block
    }
    return s == "hello";
  }

  public boolean test2(String s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a placeholder comment for the if block
    } else {
      // This is a placeholder comment for the else block
    }
    return s == x;
  }

  boolean test3(String s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a placeholder comment for the if block
    } else {
      // This is a placeholder comment for the else block
    }
    return s == "hello";
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}