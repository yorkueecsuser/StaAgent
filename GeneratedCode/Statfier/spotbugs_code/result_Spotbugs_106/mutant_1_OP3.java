class NullDeref11 {

  int foo(Object o) {
    if (o!= null & o.hashCode() == 42) return 1;
    
    // Inserting an unreachable if branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable because getUnreachableCondition() always returns false
      return -1;
    }
    
    return 0;
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if branch unreachable
    return false;
  }
}