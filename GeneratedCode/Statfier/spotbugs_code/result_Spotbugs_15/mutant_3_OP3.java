class StringEqualsTest {
  String x;

  public boolean test(String s) {
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return s == "hello";
  }

  public boolean test2(String s) {
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement");
    }
    return s == x;
  }

  boolean test3(String s) {
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Yet another unreachable statement");
    }
    return s == "hello";
  }

  private boolean getCondition() {
    return false;
  }
}