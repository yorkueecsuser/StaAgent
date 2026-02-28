class StringEqualsTest {
  String x;

  public boolean test(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if block");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block");
    }
    return s == "hello";
  }

  public boolean test2(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if block in test2");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in test2");
    }
    return s == x;
  }

  boolean test3(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if block in test3");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in test3");
    }
    return s == "hello";
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}