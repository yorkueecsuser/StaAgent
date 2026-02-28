class NullDeref11 {

  int foo(Object o) {
    boolean conditionFor = getCondition();
    if (o!= null & o.hashCode() == 42) {
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is dynamically determined and should be false at runtime
      }
      return 1;
    }
    return 0;
  }

  private boolean getCondition() {
    return false; // This method ensures that the conditionFor is false, making the loop unreachable
  }
}