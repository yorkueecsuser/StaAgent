class StringEqualsTest {
  String x;

  public boolean test(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in test method.");
    }
    return s == "hello";
  }

  public boolean test2(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in test2 method.");
    }
    return s == x;
  }

  boolean test3(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in test3 method.");
    }
    return s == "hello";
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}