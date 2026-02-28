class StringEqualsTest {
  String x;

  public boolean test(String s) {
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case will never be executed
        System.out.println("This is an unreachable case");
        break;
    }
    return s == "hello";
  }

  public boolean test2(String s) {
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case will never be executed
        System.out.println("This is another unreachable case");
        break;
    }
    return s == x;
  }

  boolean test3(String s) {
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case will never be executed
        System.out.println("Yet another unreachable case");
        break;
    }
    return s == "hello";
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the switch condition always 0
  }
}