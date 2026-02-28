class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  private boolean getCondition() {
    return false;
  }
}