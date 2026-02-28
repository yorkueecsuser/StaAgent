class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}