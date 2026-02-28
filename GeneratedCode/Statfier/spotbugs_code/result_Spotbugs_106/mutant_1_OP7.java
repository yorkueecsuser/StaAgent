class NullDeref11 {

  int foo(Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    
    if (o!= null & o.hashCode() == 42) return 1;
    return 0;
  }

  private boolean getCondition() {
    return false;
  }
}