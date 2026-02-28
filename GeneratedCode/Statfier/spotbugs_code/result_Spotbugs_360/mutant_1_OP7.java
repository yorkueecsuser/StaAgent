class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    
    // Introduced unreachable while loop as per mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
    
    return 42;
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and will always return false
    return false;
  }
}