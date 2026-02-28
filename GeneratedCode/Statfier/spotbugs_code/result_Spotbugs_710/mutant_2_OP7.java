class Bug1564367 {
  void f(Object x, Object y) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }

    if (y == null) x = y;
    else System.out.println(x);
  }

  private boolean getCondition() {
    return false;
  }
}