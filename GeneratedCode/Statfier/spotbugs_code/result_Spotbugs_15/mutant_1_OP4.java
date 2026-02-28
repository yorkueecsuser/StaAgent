class StringEqualsTest {
  String x;

  public boolean test(String s) {
    // Mutant addition
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable block in test method");
    } else {
      // This block is also unreachable because the if block is unreachable
      System.out.println("This is another unreachable block in test method");
    }
    return s == "hello";
  }

  public boolean test2(String s) {
    // Mutant addition
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable block in test2 method");
    } else {
      // This block is also unreachable because the if block is unreachable
      System.out.println("This is another unreachable block in test2 method");
    }
    return s == x;
  }

  boolean test3(String s) {
    // Mutant addition
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable block in test3 method");
    } else {
      // This block is also unreachable because the if block is unreachable
      System.out.println("This is another unreachable block in test3 method");
    }
    return s == "hello";
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}