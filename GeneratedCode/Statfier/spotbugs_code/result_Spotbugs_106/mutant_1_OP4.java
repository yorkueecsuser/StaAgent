class NullDeref11 {

  int foo(Object o) {
    boolean condition = getCondition();
    if (o!= null & o.hashCode() == 42) return 1;
    if (condition) {
      // Unreachable code
      return 2;
    } else {
      // Another unreachable code
      return 3;
    }
    return 0;
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else block unreachable
    return false;
  }
}