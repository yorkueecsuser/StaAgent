class StringEqualsTest {
  String x;

  public boolean test(String s) {
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
    }
    return s == "hello";
  }

  public boolean test2(String s) {
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
    }
    return s == x;
  }

  boolean test3(String s) {
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is unreachable");
        break;
    }
    return s == "hello";
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch case is unreachable
    return false;
  }
}