class NullDeref11 {

  int foo(Object o) {
    if (o!= null & o.hashCode() == 42) return 1;
    
    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition will always be false
      return 2;
    } else {
      // This block is also unreachable because condition will always be false
      return 3;
    }

    return 0;
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else branch unreachable
    return false;
  }
}