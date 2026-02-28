class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case will always be reached
        System.out.println("Reachable case 1");
        break;
    }
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case will always be reached
        System.out.println("Reachable case 1");
        break;
    }
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case will always be reached
        System.out.println("Reachable case 1");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}