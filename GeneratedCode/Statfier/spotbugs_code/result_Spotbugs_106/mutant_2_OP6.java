class NullDeref11 {

  int foo(Object o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    
    if (o!= null & o.hashCode() == 42) return 1;
    return 0;
  }

  private boolean getCondition() {
    return false;
  }
}