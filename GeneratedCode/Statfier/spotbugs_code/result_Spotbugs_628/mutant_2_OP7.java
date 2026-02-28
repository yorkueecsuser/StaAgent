class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
  }

  private boolean getCondition() {
    return false;
  }
}