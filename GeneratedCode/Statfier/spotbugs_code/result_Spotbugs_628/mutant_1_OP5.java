class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    // Introduced unreachable switch statement
    boolean switchCondition = getSwitchCondition();
    switch(switchCondition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    // Introduced unreachable switch statement
    boolean switchCondition = getSwitchCondition();
    switch(switchCondition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    // Introduced unreachable switch statement
    boolean switchCondition = getSwitchCondition();
    switch(switchCondition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getSwitchCondition() {
    return false;
  }
}