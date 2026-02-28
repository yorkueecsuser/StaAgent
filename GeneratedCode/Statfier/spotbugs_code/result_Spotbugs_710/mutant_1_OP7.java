class Bug1564367 {
  void f(Object x, Object y) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }

    if (y == null) x = y;
    else System.out.println(x);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}