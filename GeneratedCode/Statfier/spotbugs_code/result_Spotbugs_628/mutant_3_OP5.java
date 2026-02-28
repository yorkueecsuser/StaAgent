class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the switch unreachable
  }
}