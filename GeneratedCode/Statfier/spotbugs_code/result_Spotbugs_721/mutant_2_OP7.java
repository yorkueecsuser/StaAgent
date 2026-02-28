class NullDeref7 {

  private void alwaysThrow() {
    throw new RuntimeException("Oops");
  }

  private void throwIfNull(Object o) {
    if (o == null) throw new RuntimeException("Got a null pointer");
  }

  public void foo(Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because conditionWhile is always false
    }
    if (o == null) alwaysThrow();
    System.out.println(o.hashCode());
  }

  public void bar(Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because conditionWhile is always false
    }
    if (o == null) throwIfNull(o);
    System.out.println(o.hashCode());
  }

  private boolean getCondition() {
    return false;
  }
}