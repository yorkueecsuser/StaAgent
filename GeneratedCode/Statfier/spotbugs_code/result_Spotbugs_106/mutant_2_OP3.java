class NullDeref11 {

  int foo(Object o) {
    if (o!= null & o.hashCode() == 42) return 1;
    
    // Inserting an unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      return -1;
    }
    
    return 0;
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}